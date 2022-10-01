package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.MyCardData;
import models.ResponseMyCardData;

import static constants.ServiceConstants.ENDPOINT_MY_CARDS;


public class CreateMyCardsApi extends BaseRequest {

    public ResponseData<ResponseMyCardData> createmyCardData(MyCardData myCardData ) {
        Response response = base()
                .body(myCardData)
                .get(ENDPOINT_MY_CARDS);

        response.then().log().all();
        ResponseMyCardData responseBody = response.as(ResponseMyCardData.class);
        return new ResponseData<>(response, responseBody);
    }
}