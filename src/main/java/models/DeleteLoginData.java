package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteLoginData {

    public DeleteLoginData(String identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("identifier")
    private String identifier;

    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    public String getIdentifier()
    {
        return identifier;
    }
}