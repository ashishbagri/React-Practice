package in.codeangles.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.codeangles.model.Employee;
import in.codeangles.repository.EmployeeRepository;

@Component
public class DataLoader implements CommandLineRunner{

	private EmployeeRepository employeeRepository;

	@Autowired
	public DataLoader(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public void run(String... arg0) throws Exception {
		employeeRepository.save(new Employee("Ashish",25,25));
		employeeRepository.save(new Employee("XYZ",15,225));
		employeeRepository.save(new Employee("ASD",20,215));
		employeeRepository.save(new Employee("WERWE",125,250));
		
	}

}

