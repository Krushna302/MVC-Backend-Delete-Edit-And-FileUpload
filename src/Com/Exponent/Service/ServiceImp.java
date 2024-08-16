package Com.Exponent.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Com.Exponent.Dao.DaoInterface;
import Com.Exponent.Model.Employee;

@Service
public class ServiceImp implements ServiceInterface{

	
	@Autowired
	private DaoInterface daoIn;
	
	@Override
	public void  registerEmployeeInService(Employee employee) {

		System.out.println("Hi I Am Service Layer");
		
		daoIn.registerEmployeeInDao(employee);
		
		
	}

	@Override
	public List<Employee> getAllEmployeeDetailsInService() {

	List<Employee> listEmployee = daoIn.getAllEmployeeDetailsInDao();
		
		return listEmployee;
	}

	
	
	
	
	@Override
	public Employee getSingleEmployeeDetailInService(int id) {

		
	Employee employee = daoIn.getSingleEmployeeDetailInDao(id);
		
		
		return employee;
	}

	@Override
	public List<Employee> deleteEmployeeInService(int id) {

	List<Employee> listempdel =	daoIn.deleteEmployeeInDao(id);
		
		
		return listempdel;
	}

	@Override
	public Employee editEmployeeInService(int id) {

		
	Employee emp =	daoIn.editEmployeeInDao(id);
		
		return emp;
	}

	@Override
	public List<Employee> updateEmployeeInService(Employee emp) {


	List<Employee> listemp = daoIn.updateEmployeeInDao(emp);
		
		return listemp;
	}

	@Override
	public void uploadFileInSrvice(MultipartFile file) {

		
		
		daoIn.uloadFileInDao(file);
	}

}
