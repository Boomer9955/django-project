node {
    checkout scm

    def dataList = [:]
    def theInfoName = "ansible/hosts.yml"

    File theInfoFile = new File(theInfoName)

    def words
    def key
    def value

    if (!theInfoFile.exists()) {
         println "File does not exist"

    } else {

     theInfoFile.eachLine { line ->

     if (line.trim().size() == 0) {
      return null

     } else {

      words = line.split("=")
      key=words[0] 
      value=words[1]
      dataList[key]=value

      println "${words[0]}=${words[1]}"
      }

     }
     println "$dataList.Performance"  //test if Performance has over-written the previous Performance value
    }
}
