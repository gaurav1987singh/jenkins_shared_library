def call(String workspace ){
 
  sh """
    cd "${workspace}/${serviceName}"
    echo "Start Build"
    ./gradlew build -x test
  """
}

