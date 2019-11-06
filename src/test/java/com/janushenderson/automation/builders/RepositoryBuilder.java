/**
 *
 */
package com.janushenderson.automation.builders;


import com.github.javafaker.Faker;

import java.util.UUID;

public class RepositoryBuilder {

    public static RepositoryDTO BuildRepositoryDTO() {
        Faker faker = new Faker();

        RepositoryDTO repositoryDTO = new RepositoryDTO();
        repositoryDTO.setName(UUID.randomUUID().toString());
        repositoryDTO.setDescription(faker.hobbit().quote());
        repositoryDTO.setHomepage("https://github.com");
        repositoryDTO.set_private(false);
        repositoryDTO.setHas_issues(true);
        repositoryDTO.setHas_projects(true);
        repositoryDTO.setHas_wiki(true);
        repositoryDTO.setIs_template(false);
        repositoryDTO.setTeam_id(faker.number().numberBetween(0,999999999));
        repositoryDTO.setAuto_init(true);
        repositoryDTO.setGitignore_template("VisualStudio");
        repositoryDTO.setLicense_template("mit");
        repositoryDTO.setAllow_squash_merge(true);
        repositoryDTO.setAllow_merge_commit(true);
        repositoryDTO.setAllow_rebase_merge(true);

        return repositoryDTO;
    }
}
