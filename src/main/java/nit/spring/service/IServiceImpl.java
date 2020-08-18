package nit.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nit.spring.model.Employee;
import nit.spring.repository.MyRepository;

@Service
public class IServiceImpl implements IService {

	@Autowired
	private MyRepository repo;
	@Override
	public Integer Save(Employee e) {
		e=repo.save(e);
		return e.getEmpId();
	}

	@Override
	public List<Employee> GetAll() {
        List<Employee> list=repo.findAll();
		return list;
	}
	
	@Override
	public boolean Exist(Integer id) {
		boolean value=repo.existsById(id);
		return value;
	}

	@Override
	public boolean OneRecord(Integer id) {
		Optional<Employee> e=repo.findById(id);
		 boolean value=e.isPresent();
		 return value;
	}
}
