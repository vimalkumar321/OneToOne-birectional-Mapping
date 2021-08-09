package com.vimal.onetoonebidirectional.repository;

import com.vimal.onetoonebidirectional.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Long> {

}
