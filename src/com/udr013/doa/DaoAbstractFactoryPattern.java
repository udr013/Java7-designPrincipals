package com.udr013.doa;

import java.util.Collection;

class DeptOracleDaoImpl implements DeptDAOInterface {
	@Override
	public int create(Dept e) {
		return 0;
	}

	@Override
	public Dept get(int id) {
		return null;
	}

	@Override
	public boolean delete(Dept e) {
		return false;
	}

	@Override
	public boolean update(Dept e) {
		return false;
	}

	@Override
	public Collection<Dept> getAll() {
		return null;
	}
}

// Abstract factory pattern class
abstract class DAOAbstractFactory {
	protected abstract EmployeeDAOInterface getEmployeeDAO();

	protected abstract DeptDAOInterface getDeptDAOInterface();

	public EmployeeDAOInterface getGetEmployeeDAOInstance() {
		return getEmployeeDAO();
	}

	public DeptDAOInterface getGetDeptDAOInterfaceInstance() {
		return getDeptDAOInterface();
	}
}

// factory to return Oracle DAO implementations
class OracleDAOFactory extends DAOAbstractFactory {

	@Override
	protected EmployeeDAOInterface getEmployeeDAO() {
		return new EmployeeDaoInterfaceOracleImpl();
	}

	@Override
	protected DeptDAOInterface getDeptDAOInterface() {
		return new DeptOracleDaoImpl();
	}
}

class AnotherClient {
	public static void main(String[] args) {

		// create OracleDaoFactory
		DAOAbstractFactory factory = new OracleDAOFactory();
		// Access the Employee and DeptDAO implementations
		EmployeeDAOInterface employeeDAOInterface = factory.getGetEmployeeDAOInstance();
		DeptDAOInterface deptDAO = factory.getGetDeptDAOInterfaceInstance();

		Employee employee = new Employee();
		employeeDAOInterface.create(employee);

		Dept dept = new Dept();
		deptDAO.create(dept);

	}
}
