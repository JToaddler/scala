import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

@ApiModel(description = "All details about the Applicant. ")
class Address_ {

  @ApiModelProperty
  var addressLine1: String = _;
  @ApiModelProperty
  var addressLine2: String = _;
  @ApiModelProperty
  var landMark: String = _;
  @ApiModelProperty
  var city: String = _;
  @ApiModelProperty
  var state: String = _;
  @ApiModelProperty
  var pinCode: Int = _;

  override def toString = "[Adderss Line 1=" + addressLine1 + "]"

}