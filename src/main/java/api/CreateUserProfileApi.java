package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.ResponseUserProfileData;
import models.UserProfileData;

import static constants.ServiceConstants.ENDPOINT_USER_PROFILE;

public class CreateUserProfileApi extends BaseRequest {

    public ResponseData<ResponseUserProfileData> createuserProfileData(UserProfileData userProfileData ) {
        Response response = base()
                .body(userProfileData)
                .get(ENDPOINT_USER_PROFILE);

        response.then().log().all();
        ResponseUserProfileData responseBody = response.as(ResponseUserProfileData.class);
        return new ResponseData<>(response, responseBody);
    }
}