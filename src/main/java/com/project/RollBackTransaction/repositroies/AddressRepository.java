package com.project.RollBackTransaction.repositroies;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.RollBackTransaction.model.Address;



@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{

}
