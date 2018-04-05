package managedBeans;

import java.sql.SQLException;
import java.util.*;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.mysql.jdbc.CommunicationsException;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

import DAO.DataConnect;

@ManagedBean
@RequestScoped
public class HurlingController {
	
	ArrayList<Hurling> getHurlingEx;
	private DataConnect dc;
	
	public void loadHurlingEx() throws Exception{
		DataConnect dc = new DataConnect();
		
		 getHurlingEx = new ArrayList<>();
		 getHurlingEx =  dc.getHurlingEx();
		System.out.println("Hurling.size " + getHurlingEx.size());	
	}
	
	public ArrayList<Hurling> getHurlingEx() {
		return getHurlingEx;
	}
	
	public void setHurlingEx(ArrayList<Hurling> hurlingEx) {
		this.getHurlingEx = hurlingEx;
	}
}
