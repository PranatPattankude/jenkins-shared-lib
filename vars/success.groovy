def call(){
  echo "Build Successful!"
  echo "Build Number: ${env.BUILD_NUMBER}"
  echo "Build URL: ${env.BUILD_URL}"
  echo "Current build result: ${currentBuild.result}"

            // Send email on success
  emailext(
    subject: "Build Success - ${env.JOB_NAME} #${env.BUILD_NUMBER}",
    body: "The build was successful!\n\nBuild Number: ${env.BUILD_NUMBER}\nBuild URL: ${env.BUILD_URL}",
    to: 'pranatpattankude143@gmail.com'
  )
}
