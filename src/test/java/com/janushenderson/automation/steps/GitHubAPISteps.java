package com.janushenderson.automation.steps;

import com.janushenderson.automation.builders.RepositoryDTO;
import com.janushenderson.automation.builders.RepositoryResponseDTO;
import com.janushenderson.automation.builders.UserDTO;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.SoftAssertions;

public class GitHubAPISteps {

    @Step
    public void AssertEqualUser(UserDTO actual, UserDTO expected) {

        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(actual.getLogin()).isEqualTo(expected.getLogin());
        softly.assertThat(actual.getID()).isEqualTo(expected.getID());
        softly.assertThat(actual.getNodeID()).isEqualTo(expected.getNodeID());
        softly.assertThat(actual.getAvatarURL()).isEqualTo(expected.getAvatarURL());
        softly.assertThat(actual.getGravatarID()).isEqualTo(expected.getGravatarID());
        softly.assertThat(actual.getURL()).isEqualTo(expected.getURL());
        softly.assertThat(actual.getHTMLURL()).isEqualTo(expected.getHTMLURL());
        softly.assertThat(actual.getFollowersURL()).isEqualTo(expected.getFollowersURL());
        softly.assertThat(actual.getFollowingURL()).isEqualTo(expected.getFollowingURL());
        softly.assertThat(actual.getGistsURL()).isEqualTo(expected.getGistsURL());
        softly.assertThat(actual.getStarredURL()).isEqualTo(expected.getStarredURL());
        softly.assertThat(actual.getSubscriptionsURL()).isEqualTo(expected.getSubscriptionsURL());
        softly.assertThat(actual.getOrganizationsURL()).isEqualTo(expected.getOrganizationsURL());
        softly.assertThat(actual.getReposURL()).isEqualTo(expected.getReposURL());
        softly.assertThat(actual.getEventsURL()).isEqualTo(expected.getEventsURL());
        softly.assertThat(actual.getReceivedEventsURL()).isEqualTo(expected.getReceivedEventsURL());
        softly.assertThat(actual.getType()).isEqualTo(expected.getType());
        softly.assertThat(actual.getSiteAdmin()).isEqualTo(expected.getSiteAdmin());
        softly.assertThat(actual.getName()).isEqualTo(expected.getName());
        softly.assertThat(actual.getCompany()).isEqualTo(expected.getCompany());
        softly.assertThat(actual.getBlog()).isEqualTo(expected.getBlog());
        softly.assertThat(actual.getLocation()).isEqualTo(expected.getLocation());
        softly.assertThat(actual.getEmail()).isEqualTo(expected.getEmail());
        softly.assertThat(actual.getHireable()).isEqualTo(expected.getHireable());
        softly.assertThat(actual.getBio()).isEqualTo(expected.getBio());
        //not going to match as it gets incremented.  Just making sure it is greater than 1.
        softly.assertThat(actual.getPublicRepos()).isGreaterThan(1);
        softly.assertThat(actual.getPublicGists()).isEqualTo(expected.getPublicGists());
        softly.assertThat(actual.getFollowers()).isEqualTo(expected.getFollowers());
        softly.assertThat(actual.getFollowing()).isEqualTo(expected.getFollowing());
        softly.assertThat(actual.getCreatedAt()).isEqualTo(expected.getCreatedAt());
        softly.assertThat(actual.getUpdatedAt()).isEqualTo(expected.getUpdatedAt());
        softly.assertThat(actual.getPrivateGists()).isEqualTo(expected.getPrivateGists());
        softly.assertThat(actual.getTotalPrivateRepos()).isEqualTo(expected.getTotalPrivateRepos());
        softly.assertThat(actual.getOwnedPrivateRepos()).isEqualTo(expected.getOwnedPrivateRepos());
        //not going to match as it gets incremented.  Just making sure it is greater than 1.
        softly.assertThat(actual.getDiskUsage()).isGreaterThan(1);
        softly.assertThat(actual.getCollaborators()).isEqualTo(expected.getCollaborators());
        softly.assertThat(actual.getTwoFactorAuthentication()).isEqualTo(expected.getTwoFactorAuthentication());
        softly.assertThat(actual.getPlan().getName()).isEqualTo(expected.getPlan().getName());
        softly.assertThat(actual.getPlan().getSpace()).isEqualTo(expected.getPlan().getSpace());
        softly.assertThat(actual.getPlan().getCollaborators()).isEqualTo(expected.getPlan().getCollaborators());
        softly.assertThat(actual.getPlan().getPrivateRepos()).isEqualTo(expected.getPlan().getPrivateRepos());
        softly.assertAll();
    }

    @Step
    public void AssertRepositoryCreated(RepositoryDTO expectedDTO, RepositoryResponseDTO actualDTO){

        //Validate that fields that come back in the response object match with the values set with the Post
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(expectedDTO.getName()).isEqualTo(actualDTO.getName());
        softly.assertThat(expectedDTO.getDescription()).isEqualTo(actualDTO.getDescription());
        softly.assertThat(expectedDTO.getHomepage()).isEqualTo(actualDTO.getHomepage());
        softly.assertThat(expectedDTO.is_private()).isEqualTo(actualDTO.getRepositoryPrivate());
        softly.assertThat(expectedDTO.isHas_issues()).isEqualTo(actualDTO.getHasIssues());
        softly.assertThat(expectedDTO.isHas_projects()).isEqualTo(actualDTO.getHasProjects());
        softly.assertThat(expectedDTO.isHas_wiki()).isEqualTo(actualDTO.getHasWiki());
        softly.assertThat(expectedDTO.isAllow_squash_merge()).isEqualTo(actualDTO.getAllowSquashMerge());
        softly.assertThat(expectedDTO.isAllow_merge_commit()).isEqualTo(actualDTO.getAllowMergeCommit());
        softly.assertThat(expectedDTO.isAllow_rebase_merge()).isEqualTo(actualDTO.getAllowRebaseMerge());
        softly.assertAll();
    }

}
