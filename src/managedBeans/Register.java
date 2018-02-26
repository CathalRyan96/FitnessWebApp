package managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Register {
	
	private String firstName;
	private String lastName;
	private String email;
	private int number;
	private int userId;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Register(String firstName, String lastName, String email, int number, int userId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.number = number;
		this.userId = userId;
	}
	

}
