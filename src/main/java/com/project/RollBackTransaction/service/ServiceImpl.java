package com.project.RollBackTransaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.RollBackTransaction.model.Address;
import com.project.RollBackTransaction.model.Employee;
import com.project.RollBackTransaction.repositroies.AddressRepository;
import com.project.RollBackTransaction.repositroies.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class ServiceImpl {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Transactional(rollbackOn = Exception.class)
	public void saveData() {

		Employee emp = new Employee();

		emp.setId(1);
		emp.setName("I don't know'");
		emp.setAge(15);
		employeeRepository.save(emp);
		
		int a = 20;
		int b = 4;
		int c = a/b;
		
		Address add = new Address();
		
		add.setAddressid(2);
		add.setArea("James");
	    add.setCity("Philipines");
	    
	    addressRepository.save(add);
	}
}
