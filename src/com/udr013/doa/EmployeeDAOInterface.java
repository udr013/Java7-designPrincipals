package com.udr013.doa;

import java.util.Collection;

//the CRUD operations form the basis of the DAO pattern and
// decouples the business or implementation logic from the data persistence details
public interface EmployeeDAOInterface {

	// implicitly public methods of the interface
	int create(Employee e);

	Employee get(int id);

	boolean delete(Employee e);

	boolean update(Employee e);

	Collection<Employee> getAll();

}