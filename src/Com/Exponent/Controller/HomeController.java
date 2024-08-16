package Com.Exponent.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import Com.Exponent.Model.Employee;
import Com.Exponent.Service.ServiceInterface;



@Controller
public class HomeController {
	
	
	
	@Autowired
	private ServiceInterface si;
	
	
	
	@RequestMapping(value="/reg")
	public String registerEmployee(@ModelAttribute Employee employee) {
		
		
		System.out.println("Hi I Am Controller");
		
		si.registerEmployeeInService(employee);
	
		
		return"login";
	}
	
	
	
	
	@RequestMapping(value="/log")
	public String getAllEmployeeDetails(@RequestParam ("eid") int id ,
			@RequestParam("eusername") String un ,@RequestParam("epassword") String ps ,Model m) {
		
	List<Employee>	listEmployee = si.getAllEmployeeDetailsInService();
		
		Employee employee =	si.getSingleEmployeeDetailInService(id);
	
		if(employee.getEusername().equals(un) && employee.getEpassword().equals(ps)) {
		
			
			m.addAttribute("listEmployee", listEmployee);
			return"success";
		
		}
		else {
			
			m.addAttribute("msg","Invalid  UsernName And Password ");
			
			return"login";
			
			
		}
		
		
		
	}
	
	
	@RequestMapping(value="/del")
	public String deleteEmployee(@RequestParam ("eid") int id , Model m) {
		
	List<Employee>listempdel =	si.deleteEmployeeInService(id);
		
	
	
		m.addAttribute("listEmployee", listempdel);

		return"success";
		
	}
	
	@RequestMapping(value="/edit")
	public String editEmployee(@RequestParam ("eid") int id , Model m) {
		
	Employee emp =	si.editEmployeeInService(id);
		m.addAttribute("listEmployee", emp);
		
		return"edit";
		
		
	}
	
	@RequestMapping(value="/update")
	public String updateEmployeeDetail(@ModelAttribute Employee emp , Model m) {
		
	List<Employee>listemp =	si.updateEmployeeInService(emp);
		
		m.addAttribute("listEmployee", listemp);

		return"success";
	}
	
	@RequestMapping(value="/upload" ,method = RequestMethod.POST)
	public String uploadFile(@RequestPart  MultipartFile file) {
			
			System.out.println(file.getOriginalFilename());
			
			
			si.uploadFileInSrvice(file);
			
			return"login";
			
		}
	
	
	
	
	
	
	
	
	
	

}
