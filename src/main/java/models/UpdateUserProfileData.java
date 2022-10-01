package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateUserProfileData {

    public UpdateUserProfileData(String firstName, String lastName, String nickname, String email, String phoneNumber, String dob, String gender) {
        this.firstName= firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
        this.gender = gender;
    }

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("nickname")
    private String nickname;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("dob")
    private String dob;

    @JsonProperty("gender")
    private String gender;

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

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }
    public String getNickname()
    {
        return nickname;
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
    public String getPhoneNumber() { return phoneNumber;}

    public void setDob(String dob)
    {
        this.dob = dob;
    }
    public String getDob()
    {
        return dob;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public String getGender()
    {
        return gender;
    }
}