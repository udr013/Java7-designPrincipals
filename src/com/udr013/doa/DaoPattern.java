package com.udr013.doa;

import java.util.Collection;

// data persistence details
class EmployeeDAOInterfaceImpl implements EmployeeDAOInterface {

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

class Client {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.id = 1;
		employee.age = 33;
		employee.name = "Paul";
		employee.address = "blslstreat";

		EmployeeDAOInterface employeeDAOInterface = new EmployeeDAOInterfaceImpl();
		employeeDAOInterface.create(employee);
		employeeDAOInterface.get(1);
		employeeDAOInterface.update(employee);
		employeeDAOInterface.delete(employee);
		employeeDAOInterface.getAll();
	}

}
