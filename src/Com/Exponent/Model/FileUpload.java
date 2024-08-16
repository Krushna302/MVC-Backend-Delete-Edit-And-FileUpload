package Com.Exponent.Model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class FileUpload {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;
	
	private String fileName;
	
	
	@Lob
	private byte[] file;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	
	
	
	
	@Override
	public String toString() {
		return "FileUpload [fid=" + fid + ", fileName=" + fileName + ", file=" + Arrays.toString(file) + "]";
	}

	
	
	
	
	
	
	
	
	
	
}
