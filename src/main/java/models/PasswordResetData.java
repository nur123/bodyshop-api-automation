package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PasswordResetData {

    public PasswordResetData(String identifier, String token, String newPassword) {
        this.identifier = identifier;
        this.token = token;
        this.newPassword = newPassword;
    }

    @JsonProperty("identifier")
    private String identifier;

    @JsonProperty("token")
    private String token;

    @JsonProperty("newPassword")
    private String newPassword;

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

    public void setNewPassword(String newPassword)
    {
        this.newPassword = newPassword;
    }
    public String getNewPassword()
    {
        return newPassword;
    }
}
