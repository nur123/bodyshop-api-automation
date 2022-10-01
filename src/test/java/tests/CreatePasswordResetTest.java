package tests;

import base.BaseTest;
import base.ResponseData;
import models.PasswordResetData;
import models.ResponsePasswordResetData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreatePasswordResetTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createPasswordResetdData() {
        PasswordResetData requestBody = new PasswordResetData("testerauto75@gmail.com", "6981dfdb-c5d6-4a34-bb88-2efdfd015cda", "password12345");
        ResponseData<ResponsePasswordResetData> response = createPasswordResetApi.createresetPasswordData(requestBody);
        Assertions.assertEquals(201, response.getResponse().getStatusCode());
    }
}