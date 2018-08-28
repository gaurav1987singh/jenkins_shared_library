def call(String workspace ){
 
  sh """
    cd "${workspace}/sample_javaProject"
    echo "Start Build"
    ./gradlew build -x test
  """
}

