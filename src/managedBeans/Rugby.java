package managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Rugby {
	
	private int rugbyId;
	private String rugbyEx;
	
	
	public Rugby() {
		super();
	}
	
	public Rugby(int rugbyId, String rugbyEx) {
		super();
		this.rugbyId = rugbyId;
		this.rugbyEx = rugbyEx;
	}

	public int getRugbyId() {
		return rugbyId;
	}

	public void setRugbyId(int rugbyId) {
		this.rugbyId = rugbyId;
	}

	public String getRugbyEx() {
		return rugbyEx;
	}

	public void setRugbyEx(String rugbyEx) {
		this.rugbyEx = rugbyEx;
	}

	
	

}
