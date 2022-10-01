package tests;

import base.BaseTest;
import base.ResponseData;
import models.OTPData;
import models.ResponseOtpData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateRequestOTPValidTest extends BaseTest {

    @Test
    @DisplayName("Verify create OTP API return 200 when using valid data")
    @Tag("positive")
    public void createRequestOtp() {
        OTPData requestBody = new OTPData("testerauto75@gmail.com","EMAIL");
        ResponseData<ResponseOtpData> response = createRequestOTP.createrequestvalidotp(requestBody);
        Assertions.assertEquals(201, response.getResponse().getStatusCode());
//        Assertions.assertEquals(requestBody.getIdentifier(), response.getResponseBody());
//        Assertions.assertEquals(requestBody.getOtpType(), response.getResponseBody());
    }
}