package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserProfilePictureData {

    public UserProfilePictureData(String photo) {
        this.photo = photo;
    }
    @JsonProperty("photo")
    private String photo;

    public void setPhoto(String photo)
    {
        this.photo = photo;
    }
    public String getPhoto()
    {
        return photo;
    }
}