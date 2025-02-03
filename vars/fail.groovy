def call(){
  echo "Build Failed!"
  echo "Build Number: ${env.BUILD_NUMBER}"
  echo "Build URL: ${env.BUILD_URL}"
  echo "Current build result: ${currentBuild.result}"

            // Send email on failure
  emailext(
    subject: "Build Failed - ${env.JOB_NAME} #${env.BUILD_NUMBER}",
    body: "The build has failed!\n\nBuild Number: ${env.BUILD_NUMBER}\nBuild URL: ${env.BUILD_URL}",
    to: 'pranatpattankude143@gmail.com'
  )
}
