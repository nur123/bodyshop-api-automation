package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseMyCardData  {

    @JsonProperty("statusCode")
    private String statusCode;

    @JsonProperty("message")
    private String message;

    @JsonProperty("data")
    private List<Object> data;
}