package tests;

import base.BaseTest;
import base.ResponseData;
import models.ValidateOTP;
import models.ResponseOtpValidate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateValidateOTPTest extends BaseTest {

    @Test
    @DisplayName("Verify create OTP API return 200 when using valid data")
    @Tag("positive")
    public void createValidateOtp() {
        ValidateOTP requestBody = new ValidateOTP("testerauto75@gmail.com","000000", "ForgotPassword");
        ResponseData<ResponseOtpValidate> response = createValidateOTP.createvalidateotp(requestBody);
        Assertions.assertEquals(201, response.getResponse().getStatusCode());
//        Assertions.assertEquals(requestBody.getIdentifier(), response.getResponseBody());
//        Assertions.assertEquals(requestBody.getOtpType(), response.getResponseBody());
    }
}