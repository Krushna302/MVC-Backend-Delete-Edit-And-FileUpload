package Com.Exponent.Dao;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import Com.Exponent.Model.Employee;

public interface DaoInterface {
	
	
	
	public void registerEmployeeInDao(Employee employee) ;
	
	
	public List<Employee> getAllEmployeeDetailsInDao();
	
	
	public Employee getSingleEmployeeDetailInDao(int id);
	
	
	public List<Employee> deleteEmployeeInDao(int id);
	
	
	public Employee editEmployeeInDao(int id);
	
	
	
	public List<Employee> updateEmployeeInDao(Employee emp);
	
	
	public void uloadFileInDao(MultipartFile file);
	
	
	

}
