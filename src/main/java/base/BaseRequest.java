package base;

import io.restassured.RestAssured;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.RequestSpecification;

import static constants.ServiceConstants.BASE_URL;

public class BaseRequest {

    public FilterableRequestSpecification base() {
        return (FilterableRequestSpecification) RestAssured.given()
                .baseUri(BASE_URL)
                .queryParam("latest", "true")
                .queryParam("trxSource", "Online")
                .header("Accept", "*/*")
                .header("channel", "34999")
                .header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJJT29FSXN3TFhVNlJ0blRVMzV0dGtCemdCYlluZHBscWwyellaNjVuc3ZRIn0.eyJleHAiOjE2NjUzMzYyODksImlhdCI6MTY2Mjc0NDI4OSwianRpIjoiODQyOWZlM2MtOTdlYi00NzJlLTg0OTAtMmVjOGQ5OWMyNTY1IiwiaXNzIjoiaHR0cHM6Ly90YnNtaWNybzEuY29kaW5hLmlvOjg0NDMvcmVhbG1zL3Ricy1taWNyb3NlcnZpY2VzIiwiYXVkIjoiYWNjb3VudCIsInN1YiI6IjFjNjgzYzcwLTE5M2UtNGE5Yi05MzAwLTdlMDA0YWEwMDczZSIsInR5cCI6IkJlYXJlciIsImF6cCI6InRicy1hcHAiLCJzZXNzaW9uX3N0YXRlIjoiNDhiNjA4M2ItZDY2NC00YmJkLWEzYTItYmEwNTQ0YjAxMzVkIiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbImFwcC1jdXN0b21lciIsIm9mZmxpbmVfYWNjZXNzIiwiZGVmYXVsdC1yb2xlcy10YnMtbWljcm9zZXJ2aWNlcyIsInVtYV9hdXRob3JpemF0aW9uIl19LCJyZXNvdXJjZV9hY2Nlc3MiOnsidGJzLWFwcCI6eyJyb2xlcyI6WyJjdXN0b21lciJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJwcm9maWxlIG1pY3JvcHJvZmlsZS1qd3QgYWRkcmVzcyIsInNpZCI6IjQ4YjYwODNiLWQ2NjQtNGJiZC1hM2EyLWJhMDU0NGIwMTM1ZCIsInVwbiI6InRlc3RlcmF1dG83M0BnbWFpbC5jb20iLCJhZGRyZXNzIjp7fSwibmFtZSI6IkZpdHJpYSBWaW5hIiwiZ3JvdXBzIjpbImFwcC1jdXN0b21lciIsIm9mZmxpbmVfYWNjZXNzIiwiZGVmYXVsdC1yb2xlcy10YnMtbWljcm9zZXJ2aWNlcyIsInVtYV9hdXRob3JpemF0aW9uIl0sInByZWZlcnJlZF91c2VybmFtZSI6InRlc3RlcmF1dG83M0BnbWFpbC5jb20iLCJnaXZlbl9uYW1lIjoiRml0cmlhIiwiZmFtaWx5X25hbWUiOiJWaW5hIn0.bcW18kq_Gc9wMadOJ0G7MKAoE7KylOyv6lEeFKMcMMT2TykChuy3Vo-3gkCsRXGglZyD8MVWOVTjkaW74N1WlL37sK9ZrMzQbFa1Ti--RylF0l6qnlU4CTdvUrMTrv9d1kNO2YVN0HyukmqGqUkAW9EGF_v6ph2xlRo-yC-W1iWOYHV45knU1l-G_LK5G1Rnxr2ZVWgH0Ld9Vq17uL_xelwah2LRIFV_o29yd9CCwy0gRSQUlxd_F7NYSlO84ZAq_Su-IP3B6boIr8LZwRs-5cYUwtN55cXQvpF_sqxnQIIVC0TSLxa7H5W0ekn8DyvdGVEYAjMcCi34nwKfplbg0w")
                .header("Content-Type", "application/json")
                .log().all();
    }
} 