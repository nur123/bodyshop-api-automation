package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChangePasswordData {

    public ChangePasswordData(String currentPassword, String newPassword) {
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
    }

    @JsonProperty("currentPassword")
    private String currentPassword;

    @JsonProperty("newPassword")
    private String newPassword;

    public void setCurrentPassword(String currentPassword)
    {
        this.currentPassword = currentPassword;
    }

    public String getCurrentPassword()
    {
        return currentPassword;
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
