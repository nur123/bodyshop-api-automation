package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PasswordVerifyData {

    public PasswordVerifyData(String password) {
        this.password = password;
    }

    @JsonProperty("password")
    private String password;

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPassword()
    {
        return password;
    }
}
