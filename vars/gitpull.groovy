def call(String Giturl, String Gitbranch){
  echo "Cloning the Code..."
  sh "whoami"
  git url: "${Giturl}", branch:"${Gitbranch}"
  echo "Cloned successfully."
}
