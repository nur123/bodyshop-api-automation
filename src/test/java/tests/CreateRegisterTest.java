package tests;

import base.BaseTest;
import base.ResponseData;
import models.RegisterData;
import models.ResponseRegisterData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateRegisterTest extends BaseTest {

    @Test
    @DisplayName("Verify create OTP API return 200 when using valid data")
    @Tag("positive")
    public void createRegister() {
        RegisterData requestBody = new RegisterData("testerauto75@gmail.com", "c153d01f-4260-456f-a3c1-fdf2443eb1e5", "testerauto75@gmail.com", "081517428661",
                "Fitriani", "Vinawati", "f", "password12345",  "1990-09-08", "01", "F", "");
        ResponseData<ResponseRegisterData> response = createRegister.createregister(requestBody);
        Assertions.assertEquals(201, response.getResponse().getStatusCode());
//        Assertions.assertEquals(requestBody.getIdentifier(), response.getResponseBody());
//        Assertions.assertEquals(requestBody.getOtpType(), response.getResponseBody());
    }
}