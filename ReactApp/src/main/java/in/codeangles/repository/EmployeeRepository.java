package in.codeangles.repository;

import org.springframework.data.repository.CrudRepository;

import in.codeangles.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
