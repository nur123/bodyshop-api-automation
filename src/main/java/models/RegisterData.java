package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.DateFormat;
import java.util.Date;

public class RegisterData {

    public RegisterData(String identifier, String token, String email, String phoneNumber, String firstName,
                       String lastName, String nickmane, String password, String dob, String referralCode,
                       String gender, String cardNumber) {
        this.identifier = identifier;
        this.token = token;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickmane = nickmane;
        this.password = password;
        this.dob = dob;
        this.referralCode = referralCode;
        this.gender = gender;
        this.cardNumber = cardNumber;
    }

    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("token")
    private String token;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("nickmane")
    private String nickmane;

    @JsonProperty("password")
    private String password;

    @JsonProperty("dob")
    private String dob;

    @JsonProperty("referralCode")
    private String referralCode;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("cardNumber")
    private String cardNumber;

    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setToken(String token)
    {
        this.token = token;
    }
    public String getToken()
    {
        return token;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getEmail()
    {
        return email;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return lastName;
    }

    public void setNickmane(String nickmane)
    {
        this.nickmane = nickmane;
    }
    public String getNickmane()
    {
        return nickmane;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return password;
    }

    public void setDob(String dob)
    {
        this.dob = dob;
    }
    public String getDob()
    {
        return dob;
    }

    public void setReferralCode(String referralCode)
    {
        this.referralCode = referralCode;
    }
    public String getReferralCode()
    {
        return referralCode;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public String getGender()
    {
        return gender;
    }

    public void setCardNumber(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }
    public String getCardNumber()
    {
        return cardNumber;
    }

}
