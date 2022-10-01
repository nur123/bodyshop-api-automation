package tests;

import base.BaseTest;
import base.ResponseData;
import models.UpdateUserProfileData;
import models.ResponseUpdateUserProfileData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateUpdateUserProfileTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createUpdateUserProfile() {
        UpdateUserProfileData requestBody = new UpdateUserProfileData("Fitriani2", "Vinawati2", "f", "testerauto75@gmail.com", "081517428661", "2022-09-10", "F");
        ResponseData<ResponseUpdateUserProfileData> response = updateUserProfileApi.createupdateUserProfileData(requestBody);
        Assertions.assertEquals(200, response.getResponse().getStatusCode());
    }
}