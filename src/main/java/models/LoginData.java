package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginData {

    public LoginData(String identifier, String password) {
        this.identifier = identifier;
        this.password = password;
    }

    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("password")
    private String password;

    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return password;
    }
}
