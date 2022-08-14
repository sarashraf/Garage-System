
public class Slot {
	
	//Attributes
	private int iD;
	private float width;
	private float depth;
	private Boolean avaliable;
	
	//Parameterized constructor
	public Slot(int id,float w,float d) {
		avaliable = true;
		iD = id;
		width =w;
		depth =d;
	}
	
	//Setters and Getters
	public void setAvaliblity(Boolean flag) {
		avaliable = flag;
	}
	
	public void setDepth(float d) {
		depth = d;
	}
	
	public void setWidth(float w) {
		width = w;
	}
	
	public void setID(int id) {
		iD = id;
	}
	
	public Boolean getAvaliblity() {
		return avaliable;
	}
	
	public float getWidth() {
		return width;
	}
	
	public float getDepth() {
		return depth;
	}
	
	public int getID() {
		return iD;
	}
}
