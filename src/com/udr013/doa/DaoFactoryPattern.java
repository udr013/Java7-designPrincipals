package com.udr013.doa;

// simple factory pattern
abstract class DaoFactory {
	public static int ORACLE = 1;
	public static int MYSQL = 1;

	// static method to return implemention of EmployeeDAOInterface
	public static EmployeeDAOInterface getEmployeeDaoInstance(int DbType) {
		if (DbType == ORACLE) {
			return new EmployeeDaoInterfaceOracleImpl();
		} else if (DbType == MYSQL) {
			return new EmployeeDaoInterfaceMySQLImpl();
		} else {
			return null;
		}
	}
}

class SomeClient {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.id = 1;
		employee.age = 33;
		employee.name = "Paul";
		employee.address = "blslstreat";

		EmployeeDAOInterface employeeDAOInterface = DaoFactory.getEmployeeDaoInstance(DaoFactory.MYSQL);
		employeeDAOInterface.create(employee);
		employeeDAOInterface.get(1);
		employeeDAOInterface.update(employee);
		employeeDAOInterface.delete(employee);
		employeeDAOInterface.getAll();
	}

}
