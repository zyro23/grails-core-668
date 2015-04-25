package bindy

class DummyController {

	def index(Dummy dummy) {
		println "bound MultipartFile: ${dummy.file.dump()}"
		println "request.getFile: ${request.getFile('file').dump()}"
		render "ok"
	}
	
}
