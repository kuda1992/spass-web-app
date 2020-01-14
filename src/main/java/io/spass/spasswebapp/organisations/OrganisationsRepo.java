package io.spass.spasswebapp.organisations;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrganisationsRepo extends CrudRepository<Organisation, Long> {

    List<Organisation> findByOrganisationName(String organisationName);

    Organisation findById(long id);
}
