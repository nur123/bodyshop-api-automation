package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseUserProfileData  {

    @JsonProperty("statusCode")
    private String statusCode;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private Object data;
}