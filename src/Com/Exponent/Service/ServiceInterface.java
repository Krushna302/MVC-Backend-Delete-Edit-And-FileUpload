package Com.Exponent.Service;

import java.util.List;


import org.springframework.web.multipart.MultipartFile;

import Com.Exponent.Model.Employee;

public interface ServiceInterface {
	
	
	
	public void registerEmployeeInService(Employee employee);
	
	
	public List<Employee> getAllEmployeeDetailsInService();
	
	public Employee getSingleEmployeeDetailInService(int id);
	
	
	public List<Employee> deleteEmployeeInService(int id);
	

	public Employee editEmployeeInService(int id);
	
	
	public List<Employee> updateEmployeeInService(Employee emp);
	
	public void uploadFileInSrvice(MultipartFile file);
	
	
	
	
}
