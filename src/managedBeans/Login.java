package managedBeans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Login {
	
	private String pwd;
	private String user;
	private String errorMsg;


	
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
	
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Login(String pwd, String user, String errorMsg) {
		super();
		this.pwd = pwd;
		this.user = user;
		this.errorMsg = errorMsg;
	}
	
	
	
		
		
	}
	
	
	


