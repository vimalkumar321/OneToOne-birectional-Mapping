package com.vimal.onetoonebidirectional.repository;

import com.vimal.onetoonebidirectional.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
    
}
