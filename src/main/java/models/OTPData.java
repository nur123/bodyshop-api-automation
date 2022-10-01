package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OTPData {

    public OTPData(String identifier, String otpType) {
        this.identifier = identifier;
        this.otpType = otpType;
    }

    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("otpType")
    private String otpType;

    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setOtpType(String otpType)
    {
        this.otpType = otpType;
    }
    public String getOtpType()
    {
        return otpType;
    }
}
