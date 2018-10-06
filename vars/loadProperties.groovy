def call() {

  def scriptsPath = ''
 
  scriptsPath = '../Jenkins/test_builds.properties'

  
  def properties = readProperties file:"$scriptPath"
  return properties
}

