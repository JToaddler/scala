package com.madlabs.caretaker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication

object UtilityMain extends App {

  SpringApplication.run(classOf[UtilityMain]);

}

@SpringBootApplication(scanBasePackages = Array("com.madlabs.*"))
class UtilityMain {

}