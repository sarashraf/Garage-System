import java.util.ArrayList;

public class GarageHistory {
	//attributes.
	
	//attribute to store total income.
	private static long totalIncome = 0;
	
	//attribute to store parked out vehicles.
	private static ArrayList<Vehicle> outVehicles = new ArrayList<Vehicle>();
	
	//attribute to store slots of the garage.
	private static ArrayList<Slot> slots= new ArrayList<Slot>();
	
	//add new vehicle.
	public void addVehicle(Vehicle newV) {
		outVehicles.add(newV);
	}
	//add new fees on the total income.
	public void addIncome(int fees) {
		totalIncome += fees;
	}
	
	//add slots.
	public void addSlots(ArrayList<Slot> slots) {
		GarageHistory.slots = slots;
	}
	
	//getters and setters.
	public long getTotalIncome() {
		return totalIncome;
	}
	
	public long getNumOfVehicles() {
		return outVehicles.size();
	}

	public static ArrayList<Slot> getSlots() {
		return slots;
	}


}
