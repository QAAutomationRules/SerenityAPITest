package com.janushenderson.automation.builders;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Plan {

    private String name;
    private long space;
    private long collaborators;
    private long privateRepos;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("space")
    public long getSpace() { return space; }
    @JsonProperty("space")
    public void setSpace(long value) { this.space = value; }

    @JsonProperty("collaborators")
    public long getCollaborators() { return collaborators; }
    @JsonProperty("collaborators")
    public void setCollaborators(long value) { this.collaborators = value; }

    @JsonProperty("private_repos")
    public long getPrivateRepos() { return privateRepos; }
    @JsonProperty("private_repos")
    public void setPrivateRepos(long value) { this.privateRepos = value; }
}
