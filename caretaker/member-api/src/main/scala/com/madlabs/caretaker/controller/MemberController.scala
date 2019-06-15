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

@CrossOrigin
@RestController
class MemberController{

  @ApiOperation(value = "Create account for given Applicatn information")
  @RequestMapping(path = Array("create-account"), method = Array(RequestMethod.POST), consumes = Array(MediaType.APPLICATION_JSON_VALUE))
  def createAccount(@RequestBody applicant: Applicant): (CreateAccResponse @ResponseBody) = {
    println(applicant)
    val response: CreateAccResponse = new CreateAccResponse("asd","100");
    response.setMessage("Account created");
    response.setCode("100");
    return response;
  }
  
  

}