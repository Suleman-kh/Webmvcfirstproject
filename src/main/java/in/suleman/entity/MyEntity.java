package in.suleman.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MyEntity {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empId;
	private String name;
	private String email;
	private String password;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MyEntity [empId=" + empId + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
	

	

}
