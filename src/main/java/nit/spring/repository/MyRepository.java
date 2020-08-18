package nit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nit.spring.model.Employee;

public interface MyRepository extends JpaRepository<Employee,Integer> {

}
