def call(String ImageName, String ImageTag){
  echo "This is building the code"
  bat "docker build -t "${ImageName}":"${ImageTag}" ."
}
