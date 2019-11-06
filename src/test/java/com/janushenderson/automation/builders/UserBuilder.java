package com.janushenderson.automation.builders;

import com.github.javafaker.Faker;
import com.google.gson.Gson;

public class UserBuilder {

    public static UserDTO BuildUserJSON() {
        Gson gson = new Gson();

        //create Plan
        Plan plan = new Plan();
        plan.setName("free");
        plan.setSpace(976562499);
        plan.setCollaborators(0);
        plan.setPrivateRepos(10000);

        //Create UserDto
        UserDTO userDTO = new UserDTO();
        userDTO.setLogin("KTJ-Demo");
        userDTO.setID(53450794);
        userDTO.setNodeID("MDQ6VXNlcjUzNDUwNzk0");
        userDTO.setAvatarURL("https://avatars2.githubusercontent.com/u/53450794?v=4");
        userDTO.setGravatarID("");
        userDTO.setURL("https://api.github.com/users/KTJ-Demo");
        userDTO.setHTMLURL("https://github.com/KTJ-Demo");
        userDTO.setFollowersURL("https://api.github.com/users/KTJ-Demo/followers");
        userDTO.setFollowingURL("https://api.github.com/users/KTJ-Demo/following{/other_user}");
        userDTO.setGistsURL("https://api.github.com/users/KTJ-Demo/gists{/gist_id}");
        userDTO.setStarredURL("https://api.github.com/users/KTJ-Demo/starred{/owner}{/repo}");
        userDTO.setSubscriptionsURL("https://api.github.com/users/KTJ-Demo/subscriptions");
        userDTO.setOrganizationsURL("https://api.github.com/users/KTJ-Demo/orgs");
        userDTO.setReposURL("https://api.github.com/users/KTJ-Demo/repos");
        userDTO.setEventsURL("https://api.github.com/users/KTJ-Demo/events{/privacy}");
        userDTO.setReceivedEventsURL("https://api.github.com/users/KTJ-Demo/received_events");
        userDTO.setType("User");
        userDTO.setSiteAdmin(false);
        userDTO.setName(null);
        userDTO.setCompany(null);
        userDTO.setBlog("");
        userDTO.setLocation(null);
        userDTO.setEmail(null);
        userDTO.setHireable(null);
        userDTO.setBio(null);
        userDTO.setPublicRepos(26);
        userDTO.setPublicGists(0);
        userDTO.setFollowers(0);
        userDTO.setFollowing(0);
        userDTO.setCreatedAt("2019-07-29T20:51:04Z");
        userDTO.setUpdatedAt("2019-07-29T20:51:04Z");
        userDTO.setPrivateGists(0);
        userDTO.setTotalPrivateRepos(1);
        userDTO.setOwnedPrivateRepos(1);
        userDTO.setDiskUsage(69);
        userDTO.setCollaborators(0);
        userDTO.setTwoFactorAuthentication(false);
        userDTO.setPlan(plan);

        return userDTO;
    }
}
