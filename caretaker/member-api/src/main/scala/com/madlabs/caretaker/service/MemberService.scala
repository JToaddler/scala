package com.madlabs.caretaker.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

import com.madlabs.caretaker.model.ZipCodeDetail
import org.springframework.web.util.UriBuilderFactory
import org.springframework.web.util.UriComponentsBuilder

@Component
class MemberService {

  @Value("${zipcode.serviceURL}")
  var serviceURL: String = null;

  @Autowired
  val restTemplate: RestTemplate = null;

  def createAccount(): Unit = {

  }

  @throws(classOf[Exception])
  def getzipCodeDetail(zipCode: Long): ZipCodeDetail = {
    try {
      return restTemplate.getForObject(String.format(serviceURL format zipCode, Array(zipCode)), classOf[ZipCodeDetail])
    } catch {
      case unknown: Throwable => {
        Console println unknown
        throw unknown;
      }
    }
  }
}