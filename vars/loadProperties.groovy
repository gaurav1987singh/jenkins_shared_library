def call() {

  def scriptsPath = ''
 
  scriptsPath = '../Jenkins'

  
  def properties = readProperties file:"$scriptsPath/test_builds.properties"
  return properties
}

