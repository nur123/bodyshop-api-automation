package tests;

import base.BaseTest;
import base.ResponseData;
import models.ChangePasswordData;
import models.ResponseChangePasswordData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateChangePasswordTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createChangePassword() {
        ChangePasswordData requestBody = new ChangePasswordData("password1234", "password12345");
        ResponseData<ResponseChangePasswordData> response = createChangePasswordApi.createchangePasswordData(requestBody);
        Assertions.assertEquals(200, response.getResponse().getStatusCode());
    }
}