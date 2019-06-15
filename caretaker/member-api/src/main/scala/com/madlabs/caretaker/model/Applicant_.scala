package com.madlabs.caretaker.model

import io.swagger.annotations.Api
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(description = "All details about the Applicant. ")
class Applicant_ {

  @ApiModelProperty
  var firstName: String = _;
  @ApiModelProperty
  var lastName: String = _;
  @ApiModelProperty
  var maritalStatus: MaritalStatusEnum = _;
  @ApiModelProperty
  var email: String = _;
  @ApiModelProperty
  var phoneNumber: Int = _;
  @ApiModelProperty
  var occupation: OccupationEnum = _;
  @ApiModelProperty
  var stayReason: String = _;
  @ApiModelProperty
  var address: Address = _;

  override def toString = "[firstName=" + firstName + "[Address=" + this.address + "]]"

}
