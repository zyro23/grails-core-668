package bindy

class EventController {
  def index() {
    [model: [event: new EventSaveCmd()]]
  }

  def save(EventSaveCmd cmd) {
    println cmd.dump()
    request.getFiles('assetFiles').each { f ->
      println "request.getFile: ${f.dump()}"
    }
  }
}
