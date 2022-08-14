
import java.util.*;

@SuppressWarnings("unused")

public class ParkOut {
	
	public void parkOut() {
		Screen sc = new Screen();
		Garage g = new Garage();
		int ID = sc.enterVehicleID();
		
	
		//finding the parked vehicle.
		for(Vehicle i : g.getVehicles()) {
			
			if(i.getID() == ID) {
				
				// the car was found
				
				//calculate departure time
				
				CalcTime time = new CalcTime();
				time.setDepartureTime(i);
				
				//set slot available.
				g.setAvailablity(i.getSlot().getID());
				
				//calculate receipt.
				Receipt rec = new Receipt();
				rec.calcFees(i);
				
				
				//add fees to the total income to garage history
				GarageHistory gH = new GarageHistory();
				gH.addIncome(i.getFees());
				
				//add vehicle to garage history
				gH.addVehicle(i);
				
				
				
				//remove vehicle from the garage.
				g.getVehicles().remove(i);
				
				//printing receipt
				sc.printReceipt(i);
				return;	
			}
			
		}
		//if the id not found.
		sc.notFound();
	}
}
