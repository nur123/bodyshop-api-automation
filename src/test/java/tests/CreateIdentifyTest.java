package tests;

import base.BaseTest;
import base.ResponseData;
import models.IDENTIFYData;
import models.ResponseIdentifyData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateIdentifyTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createIdentifyValidData() {
        IDENTIFYData requestBody = new IDENTIFYData("testerauto75@gmail.com");
        ResponseData<ResponseIdentifyData> response = createIdentifyUserApi.createwithValidData(requestBody);
        Assertions.assertEquals(201, response.getResponse().getStatusCode());
    }
}