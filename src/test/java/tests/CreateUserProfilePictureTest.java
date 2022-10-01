package tests;

import base.BaseTest;
import base.ResponseData;
import models.ResponseUserProfilePictureData;
import models.UserProfilePictureData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateUserProfilePictureTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createUserProfilePicture() {
        UserProfilePictureData requestBody = new UserProfilePictureData("https://imageio.forbes.com/specials-images/dam/imageserve/963388198/960x0.jpg?format=jpg&width=960");
        ResponseData<ResponseUserProfilePictureData> response = createUserProfilePictureApi.createuserprofilePictureData(requestBody);
        Assertions.assertEquals(200, response.getResponse().getStatusCode());
    }
}