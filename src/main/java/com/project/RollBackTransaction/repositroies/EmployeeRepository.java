package com.project.RollBackTransaction.repositroies;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.RollBackTransaction.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
