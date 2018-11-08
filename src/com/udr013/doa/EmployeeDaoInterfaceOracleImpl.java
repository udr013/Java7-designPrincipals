package com.udr013.doa;

import java.util.Collection;

// data persistence details, implementation for ORACLE
public class EmployeeDaoInterfaceOracleImpl implements EmployeeDAOInterface {

	@Override
	public int create(Employee e) {
		return 0;
	}

	@Override
	public Employee get(int id) {
		return null;
	}

	@Override
	public boolean delete(Employee e) {
		return false;
	}

	@Override
	public boolean update(Employee e) {
		return false;
	}

	@Override
	public Collection<Employee> getAll() {
		return null;
	}
}
