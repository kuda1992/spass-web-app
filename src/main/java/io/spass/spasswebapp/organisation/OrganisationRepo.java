package io.spass.spasswebapp.organisation;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrganisationRepo extends CrudRepository<Organisation, Long> {

    List<Organisation> findByOrganisationName(String organisationName);

    Organisation findById(long id);
}
