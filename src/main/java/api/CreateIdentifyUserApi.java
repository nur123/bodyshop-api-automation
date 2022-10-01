package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.IDENTIFYData;
import models.OTPData;
import models.ResponseIdentifyData;
import models.ResponseOtpData;

import static constants.ServiceConstants.ENDPOINT_CREATE_IDENTIFY_USER;

public class CreateIdentifyUserApi extends BaseRequest {

    public ResponseData<ResponseIdentifyData> createwithValidData(IDENTIFYData identifyData ) {
               Response response = base()
                .body(identifyData)
                .post(ENDPOINT_CREATE_IDENTIFY_USER);

        response.then().log().all();
        ResponseIdentifyData responseBody = response.as(ResponseIdentifyData.class);
        return new ResponseData<>(response, responseBody);
    }
}