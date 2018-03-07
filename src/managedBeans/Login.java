package managedBeans;

import javax.faces.bean.ManagedBean;
import javax.servlet.http.HttpSession;

import org.apache.catalina.manager.util.SessionUtils;

import DAO.LoginDAO;

@ManagedBean
public class Login {
	
	private String pwd;
	private String user;
	private String errorMsg;


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
	
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	public String validateUsernamePassword() {
		boolean valid = LoginDAO.validate(user, pwd);
		if(valid)
		{
			HttpSession session = SessionUtils.getSession();
			session.setAttribute("username", user);
			return "admin";
		}else {
			
			FacesContext.getCurrentInstance().addMessage(null,new
					FacesMessage(FacesMessage.SEVERITY_WARN,
							"Incorrect Username and Passowrd",
							return "login";
		}
							
			
		}
		
	}
	
	
	

}
