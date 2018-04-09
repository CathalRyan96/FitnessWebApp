package managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Soccer {
	
	private int soccerId;
	private String soccerEx;
	
	
	public Soccer() {
		super();
	}


	public Soccer(int soccerId, String soccerEx) {
		super();
		this.soccerId = soccerId;
		this.soccerEx = soccerEx;
	}


	public int getSoccerId() {
		return soccerId;
	}


	public void setSoccerId(int soccerId) {
		this.soccerId = soccerId;
	}


	public String getSoccerEx() {
		return soccerEx;
	}


	public void setSoccerEx(String soccerEx) {
		this.soccerEx = soccerEx;
	}
	
	
	
	

}
