package managedBeans;

import java.sql.SQLException;
import java.util.*;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.mysql.jdbc.CommunicationsException;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

import DAO.DataConnect;

@ManagedBean
public class HurlingController {
	
	ArrayList<Hurling> hurlingEx;
	private DataConnect dc;
	
	public void loadHurlingEx() throws Exception{
		DataConnect dc = new DataConnect();
		
		 hurlingEx = new ArrayList<>();
		 hurlingEx =  dc.getHurlingEx();
		System.out.println("Hurling.size " + hurlingEx.size());	
	}
}
