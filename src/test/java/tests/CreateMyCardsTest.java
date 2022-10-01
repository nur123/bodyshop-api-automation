package tests;

import base.BaseTest;
import base.ResponseData;
import models.MyCardData;
import models.ResponseMyCardData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateMyCardsTest extends BaseTest {

    @Test
    @DisplayName("Verify create Identify API return 200 when using valid data")
    @Tag("positive")
    public void createMyCards() {
        MyCardData requestBody = new MyCardData();
        ResponseData<ResponseMyCardData> response = createMyCardsApi.createmyCardData(requestBody);
        Assertions.assertEquals(200, response.getResponse().getStatusCode());
    }
}