package com.janushenderson.automation.builders;


import com.fasterxml.jackson.annotation.*;


public class Permissions {
    private boolean admin;
    private boolean push;
    private boolean pull;

    @JsonProperty("admin")
    public boolean getAdmin() { return admin; }
    @JsonProperty("admin")
    public void setAdmin(boolean value) { this.admin = value; }

    @JsonProperty("push")
    public boolean getPush() { return push; }
    @JsonProperty("push")
    public void setPush(boolean value) { this.push = value; }

    @JsonProperty("pull")
    public boolean getPull() { return pull; }
    @JsonProperty("pull")
    public void setPull(boolean value) { this.pull = value; }
}
