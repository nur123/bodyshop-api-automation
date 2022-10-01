package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseDeleteLoginData  {

    @JsonProperty("statusCode")
    private String statusCode;

    @JsonProperty("message")
    private String message;
}