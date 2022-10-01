package tests;

import base.BaseTest;
import base.ResponseData;
import models.LoginData;
import models.ResponseLoginData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class LoginUserTest extends BaseTest {

    @Test
    @DisplayName("Verify create OTP API return 200 when using valid data")
    @Tag("positive")
    public void loginUser() {
        LoginData requestBody = new LoginData("testerauto75@gmail.com","password12345");
        ResponseData<ResponseLoginData> response = loginUser.loginuser(requestBody);
        Assertions.assertEquals(201, response.getResponse().getStatusCode());
//        Assertions.assertEquals(requestBody.getIdentifier(), response.getResponseBody());
//        Assertions.assertEquals(requestBody.getOtpType(), response.getResponseBody());
    }
}