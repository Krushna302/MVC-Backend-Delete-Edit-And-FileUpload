package Com.Exponent.Dao;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import Com.Exponent.Model.Employee;
import Com.Exponent.Model.FileUpload;




@Repository
public class DaoImp implements DaoInterface{

	
	
	@Autowired
	private SessionFactory sf;
	
	
	
	
	
	@Override
	public void registerEmployeeInDao(Employee employee) {

		
		System.out.println("Hi I AM Dao Layer");
		
	  Session s =	sf.openSession();
		
		s.save(employee);
		s.beginTransaction().commit();
		
		
		
		
	}





	@Override
	public List<Employee> getAllEmployeeDetailsInDao() {

			Session s =	sf.openSession();
			
		Query<Employee>	query = s.createQuery("from Employee");
		
		List<Employee> listEmployee =	query.getResultList();
		
		return listEmployee;
	}





	@Override
	public Employee getSingleEmployeeDetailInDao(int id) {

			Session s =	sf.openSession();
			
		Employee employee = s.get(Employee.class, id);
			
			
		
		
		return employee;
	}





	@Override
	public List<Employee> deleteEmployeeInDao(int id) {
		
	Session s =	sf.openSession();
		
	Employee empdel = s.get(Employee.class, id);	
	
	s.delete(empdel);
	
	s.beginTransaction().commit();
	
	Query<Employee> query = s.createQuery("from Employee");
	
	List<Employee> listempdel = query.getResultList();
	
	return listempdel;
	
	
	}





	@Override
	public Employee editEmployeeInDao(int id) {

		Session s = sf.openSession();
		
	Employee emp =	s.get(Employee.class, id);

		
		return emp ;
	}





	@Override
	public List<Employee> updateEmployeeInDao(Employee emp) {

		Session s = sf.openSession();
		
		s.update(emp);
		s.beginTransaction().commit();
		
		
	Query<Employee> query =	s.createQuery("from Employee");
		
	List<Employee> listemp = query.getResultList();
	
	return listemp;
	
	
	}





	@Override
	public void uloadFileInDao(MultipartFile file) {
	
	try {
		Session s =	sf.openSession();

		FileUpload fileupload = new FileUpload();
		fileupload.setFileName(file.getOriginalFilename());
		fileupload.setFile(file.getBytes());

		s.save(fileupload);
		
		s.beginTransaction().commit();
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
		
	}

	
	
	
}
