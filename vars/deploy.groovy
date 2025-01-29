def call(){
  echo "Deploying application..."
  sh "docker-compose down && docker-compose up -d"
}
