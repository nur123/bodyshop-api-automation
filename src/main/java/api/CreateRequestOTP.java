package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.OTPData;
import models.ResponseOtpData;

import static constants.ServiceConstants.ENDPOINT_CREATE_REQUEST_OTP;

public class CreateRequestOTP extends BaseRequest {

    public ResponseData<ResponseOtpData> createrequestvalidotp(OTPData otpData) {
        Response response = base()
                .body(otpData)
                .post(ENDPOINT_CREATE_REQUEST_OTP);

        response.then().log().all();
        ResponseOtpData responseBody = response.as(ResponseOtpData.class);
        return new ResponseData<>(response, responseBody);
    }
}