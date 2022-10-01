package tests;

import base.BaseTest;
import base.ResponseData;
import models.PasswordVerifyData;
import models.ResponsePasswordVerifyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreatePasswordVerifyTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createPasswordVerify() {
        PasswordVerifyData requestBody = new PasswordVerifyData("password12345");
        ResponseData<ResponsePasswordVerifyData> response = createPasswordVerifyApi.createpasswordVerifyData(requestBody);
        Assertions.assertEquals(201, response.getResponse().getStatusCode());
    }
}