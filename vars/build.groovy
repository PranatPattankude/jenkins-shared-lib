drf call(String Project, String Tag){
  echo "Building the Code..."
  sh "docker build -t ${Project}:${Tag} ."
  echo "Build Successfully."
}
