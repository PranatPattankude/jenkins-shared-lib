def call(String Project, String Tag){
  echo "Pushing the image to DockerHub..."
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred',passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]){
  sh "echo ${dockerHubPass} | docker login -u ${dockerHubUser} --password-stdin"
  sh "docker image tag apache-app:latest ${dockerHubUser}/apache-app:latest"
  sh "docker push ${dockerHubUser}/${Project}:${Tag}"
  }
}
