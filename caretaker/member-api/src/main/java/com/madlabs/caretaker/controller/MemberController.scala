package com.madlabs.caretaker.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RequestMethod
import scala.collection.SortedMap.Default

@RestController
class MemberController {

  @RequestMapping(path = Array("/create-acount"), method = Array(RequestMethod.GET))
  def test(): (String @ResponseBody) = {
    """{"message":"hello"}"""
  }

}