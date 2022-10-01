package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.ResponseUserProfilePictureData;
import models.UserProfilePictureData;

import static constants.ServiceConstants.ENDPOINT_USER_PROFILE_PICTURE;

public class CreateUserProfilePictureApi extends BaseRequest {

    public ResponseData<ResponseUserProfilePictureData> createuserprofilePictureData(UserProfilePictureData userProfilePictureData ) {
        Response response = base()
                .body(userProfilePictureData)
                .patch(ENDPOINT_USER_PROFILE_PICTURE);

        response.then().log().all();
        ResponseUserProfilePictureData responseBody = response.as(ResponseUserProfilePictureData.class);
        return new ResponseData<>(response, responseBody);
    }
}