def call(String workspace ){
 
  sh """
    echo 'Greetings from HelloFromShared_library from HelloFile and this is using method argument: ${workspace}'
  """
}

