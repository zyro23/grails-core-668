package bindy

import grails.validation.Validateable
import org.springframework.web.multipart.MultipartFile

class EventSaveCmd implements Validateable {
  String name
  String description
  MultipartFile assetFile

  static constraints = {
    description nullable: true, blank: true
  }
}
