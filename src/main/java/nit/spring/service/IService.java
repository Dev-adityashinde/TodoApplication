package nit.spring.service;

import java.util.List;
import java.util.Optional;

import nit.spring.model.Employee;


public interface IService {

	public Integer Save(Employee e);
	public List<Employee> GetAll();
	public boolean Exist(Integer id);
	public boolean OneRecord(Integer id);
	
}
