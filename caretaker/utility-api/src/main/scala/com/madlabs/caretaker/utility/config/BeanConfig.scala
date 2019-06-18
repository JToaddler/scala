package com.madlabs.caretaker.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate
import org.springframework.context.annotation.Bean

@Configuration
class BeanConfig {

  @Bean
  def getRestTemplate() = new RestTemplate();

}