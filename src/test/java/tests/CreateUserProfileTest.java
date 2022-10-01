package tests;

import base.BaseTest;
import base.ResponseData;
import models.ChangePasswordData;
import models.ResponseChangePasswordData;
import models.ResponseUserProfileData;
import models.UserProfileData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateUserProfileTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createUserProfile() {
        UserProfileData requestBody = new UserProfileData();
        ResponseData<ResponseUserProfileData> response = createUserProfileApi.createuserProfileData(requestBody);
        Assertions.assertEquals(200, response.getResponse().getStatusCode());
    }
}