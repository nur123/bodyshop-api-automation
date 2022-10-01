package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.LoginData;
import models.ResponseLoginData;

import static constants.ServiceConstants.ENDPOINT_LOGIN_USER;


public class LoginUser extends BaseRequest {

    public ResponseData<ResponseLoginData> loginuser(LoginData loginData) {
        Response response = base()
                .body(loginData)
                .post(ENDPOINT_LOGIN_USER);

        response.then().log().all();
        ResponseLoginData responseBody = response.as(ResponseLoginData.class);
        return new ResponseData<>(response, responseBody);
    }
}