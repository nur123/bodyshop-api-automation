package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.ResponseUpdateUserProfileData;
import models.UpdateUserProfileData;

import static constants.ServiceConstants.ENDPOINT_UPDATE_USER_PROFILE;


public class UpdateUserProfileApi extends BaseRequest {

    public ResponseData<ResponseUpdateUserProfileData> createupdateUserProfileData(UpdateUserProfileData updateUserProfileData ) {
        Response response = base()
                .body(updateUserProfileData)
                .patch(ENDPOINT_UPDATE_USER_PROFILE);

        response.then().log().all();
        ResponseUpdateUserProfileData responseBody = response.as(ResponseUpdateUserProfileData.class);
        return new ResponseData<>(response, responseBody);
    }
}