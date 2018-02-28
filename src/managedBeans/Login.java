package managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Login {
	
	private String pwd;
	private String user;
	
	
	public Login(String pwd, String user) {
		super();
		this.pwd = pwd;
		this.user = user;
	}
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	
	
	

}
