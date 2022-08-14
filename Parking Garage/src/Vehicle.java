
public class Vehicle {
	
	//Attributes
	private String modelName;
	private String modelYear;
	private int iD;
	private float width;
	private float depth;
	private String arrivalTime;
	private String departureTime;
	private double stayTime;
	private Slot slot;
	private int fees;
	
	
	//Parameterized constructors 
	
	public Vehicle(String mn, String my,int id ,float w, float d) {
		setModelName(mn);
		setModelYear(my);
		iD = id;
		width = w;
		depth = d;
	}
	
	public Vehicle(String mn, String my,int id ,float w, float d,Slot s) {
		setModelName(mn);
		setModelYear(my);
		iD = id;
		width = w;
		depth = d;
		float ww = s.getWidth();
		float dd = s.getDepth();
		int idd = s.getID();
		slot = new Slot(idd,ww,dd);
		slot.setAvaliblity(false);
	}
	
	//Setters and getters.
	public void setArrivalTime(String time) {
		arrivalTime = time;
	}
	public void setDepartureTime(String time) {
		departureTime = time;
	}
	public void setStayTime(double sT) {
		stayTime = sT;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public double getStayTime() {
		return stayTime;
	}
	public int getID() {
		return this.iD;
	}
	public float getWidth() {
		return width;
	}
	public float getDepth() {
		return depth;
	}
	public void setSlot(Slot s) {
		float w = s.getWidth();
		float d = s.getDepth();
		int id = s.getID();
		slot = new Slot(id,w,d);
	}
	public Slot getSlot() {
		return slot;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getModelYear() {
		return modelYear;
	}

	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
	
}
