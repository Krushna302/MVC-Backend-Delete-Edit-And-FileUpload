package Com.Exponent.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	
	
	@Id
	private int eid;
	
	private String ename;
	
	private String edepart;

	private String emobno;

	private String eaddress;

	private String eusername;

	private String epassword;

	
	
	
	
	
	
	
	
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdepart() {
		return edepart;
	}

	public void setEdepart(String edepart) {
		this.edepart = edepart;
	}

	public String getEmobno() {
		return emobno;
	}

	public void setEmobno(String emobno) {
		this.emobno = emobno;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public String getEusername() {
		return eusername;
	}

	public void setEusername(String eusername) {
		this.eusername = eusername;
	}

	public String getEpassword() {
		return epassword;
	}

	public void setEpassword(String epassword) {
		this.epassword = epassword;
	}

	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edepart=" + edepart + ", emobno=" + emobno
				+ ", eaddress=" + eaddress + ", eusername=" + eusername + ", epassword=" + epassword + "]";
	}


	
	
	
	
	
	

}
