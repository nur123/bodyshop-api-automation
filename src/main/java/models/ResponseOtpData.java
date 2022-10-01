package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseOtpData  {

    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("otpType")
    private String otpType;

    @JsonProperty("statusCode")
    private String statusCode;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private Object data;
}
