

public class Configration {
	//attributes
	private int con;
	
	//set configuration.
	public void setConfigration(int c) {
		con  = c;
	}
	
	//get current configuration.
	public ParkWay getConfigration() {
		if(con == 1) {
			
			return new FirstFit();
		}
		else {
			
			return new BestFit();
		}
	}
	
}
