package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.DeleteLoginData;
import models.ResponseDeleteLoginData;

import static constants.ServiceConstants.ENDPOINT_DELETE_USER;

public class DeleteUserApi extends BaseRequest {

    public ResponseData<ResponseDeleteLoginData> deleteUserApi(DeleteLoginData loginData) {
        Response response = base()
                .body(loginData)
                .delete(ENDPOINT_DELETE_USER);

        response.then().log().all();
        ResponseDeleteLoginData responseBody = response.as(ResponseDeleteLoginData.class);
        return new ResponseData<>(response, responseBody);
    }
}