def call(String Giturl, String Gitbranch){
  echo "Cloning the Code..."
  git url: "${Giturl}", branch:"${Gitbranch}"
  echo "Cloned successfully."
}
