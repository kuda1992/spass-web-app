package io.spass.spasswebapp.organisation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganisationRepo extends JpaRepository<Organisation, Long> {

    List<Organisation> findByOrganisationName(String name);

    Organisation findById(long id);
}
