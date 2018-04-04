package managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Hurling {
	
	private int hurlingId;
	private String hurlingEx;
	
	public Hurling() {
		super();

	}
	
	
	
	public Hurling(int hurlingId, String hurlingEx) {
		this.hurlingId = hurlingId;
		this.hurlingEx = hurlingEx;
		
	}
	
	//Getters and Setters
	public int getHurlingId() {
		return hurlingId;
	}
	public void setHurlingId(int hurlingId) {
		this.hurlingId = hurlingId;
	}
	public String getHurlingEx() {
		return hurlingEx;
	}
	public void setHurlingEx(String hurlingEx) {
		this.hurlingEx = hurlingEx;
	}

}
