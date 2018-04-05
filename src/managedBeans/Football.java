package managedBeans;

public class Football {
	private int footballId;
	private String footballEx;
	
	
	
	public Football() {
		super();
	}
	public Football(int footballId, String footballEx) {
		super();
		this.footballId = footballId;
		this.footballEx = footballEx;
	}
	//Getters And Setters
	public int getFootballId() {
		return footballId;
	}
	public void setFootballId(int footballId) {
		this.footballId = footballId;
	}
	public String getFootballEx() {
		return footballEx;
	}
	public void setFootballEx(String footballEx) {
		this.footballEx = footballEx;
	}

}
