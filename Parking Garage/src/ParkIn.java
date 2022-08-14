
public class ParkIn {
	
	// attribute to set the method of park in.
	static ParkWay p;
	
	//function that doing the park in process.
	public void parkIn() {
	
		Screen sc = new Screen();
		
		Vehicle newVehicle = sc.getVehicleInfo();
		Garage g = new Garage();
		
		//if not find available slot.
			if(!p.selectSlot(newVehicle, g.getSlots())) {
				sc.noAvailableSlots();
				return;
			}
		
		//set arrival time.
		CalcTime aTime = new CalcTime();
		
		aTime.setArrivalTime(newVehicle);
		
		//add the vehicle to the parked vehicles in the garage.
		Garage.vehicles.add(newVehicle);
		
		//display the slot info that the user will park in. 
		sc.displaySlot(newVehicle.getSlot());
	}
	
	//get configuration.
	public ParkWay getParkWay() {
		return p;
	}
	
	//set the configuration.
	public void setParkWay(ParkWay obj) {
		p = obj;
	}

	
}
