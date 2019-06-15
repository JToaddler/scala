package com.madlabs.caretaker

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

object MemberApp extends App {

  SpringApplication.run(classOf[MemberAPI]);

}
@SpringBootApplication(scanBasePackages = Array("com.madlabs.*"))
class MemberAPI {

}
