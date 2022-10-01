package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.ValidateOTP;
import models.ResponseOtpValidate;

import static constants.ServiceConstants.ENDPOINT_CREATE_VALIDATE_OTP;


public class CreateValidateOTP extends BaseRequest {

    public ResponseData<ResponseOtpValidate> createvalidateotp(ValidateOTP validateOTP) {
        Response response = base()
                .body(validateOTP)
                .post(ENDPOINT_CREATE_VALIDATE_OTP);

        response.then().log().all();
        ResponseOtpValidate responseBody = response.as(ResponseOtpValidate.class);
        return new ResponseData<>(response, responseBody);
    }
}