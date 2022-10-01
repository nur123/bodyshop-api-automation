package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValidateOTP {

    public ValidateOTP(String identifier, String otp, String pageType) {
        this.identifier = identifier;
        this.otp = otp;
        this.pageType = pageType;
    }

    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("otp")
    private String otp;

    @JsonProperty("pageType")
    private String pageType;

    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setOtp(String otp)
    {
        this.otp = otp;
    }
    public String getOtp()
    {
        return otp;
    }

    public void setPageType(String pageType)
    {
        this.pageType = pageType;
    }
    public String getPageType()
    {
        return pageType;
    }

}
