package com.madlabs.caretaker.controller

import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

import com.madlabs.caretaker.model.Applicant

import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.http.MediaType
import com.madlabs.caretaker.model.CreateAccResponse
import com.madlabs.caretaker.model.BaseResponse
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.util.pattern.PathPattern
import org.springframework.web.bind.annotation.PathVariable
import com.madlabs.caretaker.service.MemberService
import org.springframework.beans.factory.annotation.Autowired
import com.madlabs.caretaker.model.ZipCodeDetail
import scala.util.Try

@RestController
class MemberController {

  @Autowired
  val memberService: MemberService = null;

  @ApiOperation(value = "Create account for given Applicatn information")
  @RequestMapping(path = Array("/create-account"), method = Array(RequestMethod.POST), consumes = Array(MediaType.APPLICATION_JSON_VALUE))
  def createAccount(@RequestBody applicant: Applicant): (CreateAccResponse @ResponseBody) = {
    println(applicant)
    val response: CreateAccResponse = new CreateAccResponse("asd", "100");
    response.setMessage("Account created")
    response.setCode("100")
    return response
  }

  @RequestMapping(path = Array("/getZipCodeDetail/{zipCode}"), method = Array(RequestMethod.GET), consumes = Array(MediaType.APPLICATION_JSON_VALUE))
  def getZipCodeInfo(@PathVariable zipCode: Long): ZipCodeDetail @ResponseBody = {
    println("ZIP Code : " + zipCode)
    memberService getzipCodeDetail zipCode
  }

}