def call(String serviceName){
  // TestService -> testService

  def sb = new StringBuilder(serviceName)
  sb.setCharAt(0, Character.toLowerCase(sb.charAt(0)))
  return sb.toString()
}
