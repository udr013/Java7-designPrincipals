package com.udr013.doa;

import java.util.Collection;

public interface DeptDAOInterface {
	// implicitly public methods of the interface
	public int create(Dept e);

	public Dept get(int id);

	public boolean delete(Dept e);

	public boolean update(Dept e);

	public Collection<Dept> getAll();
}
