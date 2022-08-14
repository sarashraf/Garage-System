import java.util.ArrayList;

public class Garage {
	// attributes
	static int capacity;
	static ArrayList<Slot> slots = new ArrayList<Slot>();
	static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	//set capacity
		public void setCapacity(int num) {
			capacity = num;
		}
		//get capacity
		public int getCapacity() {
			return capacity;
		}
		
			
		//set slots
		public void setSlots(ArrayList<Slot> s) {
			slots = s;
		}
		
		//get Slots
		public ArrayList<Slot> getSlots(){
			return slots;
		}
		//add vehicle to array list in the garage.
		public void addVehicle(Vehicle v) {
			
			vehicles.add(v);
			
		}
		//get array of vehicles.
		public ArrayList<Vehicle> getVehicles(){
			return vehicles;
		}
		//set availability.
		public void setAvailablity(int id) {
			for(Slot i:slots) 
				if(i.getID()==id)
					i.setAvaliblity(true);
		
		}
		public long requestTotalIncome() {
			// calculate total income.
			GarageHistory gH = new GarageHistory();
			
			return gH.getTotalIncome();
			
		}
		public long requestTotalVehicles() {
			// calculate total vehicles.
			GarageHistory gH = new GarageHistory();
			
			return gH.getNumOfVehicles();
			
		}
	
		
}

