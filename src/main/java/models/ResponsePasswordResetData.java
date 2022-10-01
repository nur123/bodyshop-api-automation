package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponsePasswordResetData  {

    @JsonProperty("statusCode")
    private String statusCode;

    @JsonProperty("message")
    private String message;
}