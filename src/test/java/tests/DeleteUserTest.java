package tests;

import base.BaseTest;
import base.ResponseData;
import models.DeleteLoginData;
import models.ResponseDeleteLoginData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DeleteUserTest extends BaseTest {

    @Test
    @DisplayName("Verify create OTP API return 200 when using valid data")
    @Tag("positive")
    public void deleteUser() {
        DeleteLoginData requestBody = new DeleteLoginData("testerauto64@gmail.com");
        ResponseData<ResponseDeleteLoginData> response = deleteUser.deleteUserApi(requestBody);
        Assertions.assertEquals(200, response.getResponse().getStatusCode());
//        Assertions.assertEquals(requestBody.getIdentifier(), response.getResponseBody());
//        Assertions.assertEquals(requestBody.getOtpType(), response.getResponseBody());
    }




}