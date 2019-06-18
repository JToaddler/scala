package com.madlabs.caretaker.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import com.madlabs.caretaker.bo.ZipCodeDetail
import com.madlabs.caretaker.utility.service.UtilityService
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.http.MediaType

@RestController
class UtilityController {

  @Autowired
  val memberService: UtilityService = null;

  @RequestMapping(path = Array("/getZipCodeDetail/{zipCode}"), method = Array(RequestMethod.GET), consumes = Array(MediaType.APPLICATION_JSON_VALUE))
  def getZipCodeInfo(@PathVariable zipCode: Long): ZipCodeDetail @ResponseBody = {
    println("ZIP Code : " + zipCode)
    memberService getzipCodeDetail zipCode
  }

}