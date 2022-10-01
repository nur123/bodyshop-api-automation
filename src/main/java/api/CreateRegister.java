package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.RegisterData;
import models.ResponseRegisterData;

import static constants.ServiceConstants.ENDPOINT_CREATE_REGISTER;


public class CreateRegister extends BaseRequest {

    public ResponseData<ResponseRegisterData> createregister(RegisterData registerData) {
        Response response = base()
                .body(registerData)
                .post(ENDPOINT_CREATE_REGISTER);

        response.then().log().all();
        ResponseRegisterData responseBody = response.as(ResponseRegisterData.class);
        return new ResponseData<>(response, responseBody);
    }
}