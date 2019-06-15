package com.madlabs.caretaker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.SpringApplication
import java.awt.Component
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.CommandLineRunner

object MemberAPP extends App {

  SpringApplication.run(classOf[MemberAPI]);

}

@SpringBootApplication(scanBasePackages = Array("com.madlabs.*"))
class MemberAPI {

}
