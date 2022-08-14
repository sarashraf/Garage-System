import java.util.*;

//Class Screen (The boundary)
public class Screen {

	//Menu that appearers to the user
	Scanner scanner = new Scanner(System.in);
	public void Menu() {
		while(true) {
			
			System.out.println("\n\n1)Park In \n"
						    +  "2)Park Out \n"
						    +  "3)Manager Options \n"
						    +  "To close Program Enter 0 \n");
			
			int ord = scanner.nextInt();
			//when the user enter 1 then he want to park in.
			if(ord == 1) 
				startParkingIn();
				
			//when the user enter 1 then he want to park out.
			else if(ord == 2)
				startParkingOut();
			/*when the user enter 1 then he want to Show ManagerMenu 
				that include(Display available slots, Calculate Total income and vehicles).*/
			else if(ord == 3) 
				//calling Manager Menu Function
				ManagerMenu();
			//when user want to end the program.
			else if(ord == 0)
				break;
			//when user choose invalid option.
			else
				System.out.println("Invalid option, please trye again.");
		}	
		
	}
	
	//Manger Menu ,, that appears when we want to calculate total income or display available slots.
		public void ManagerMenu() {
			
			System.out.println("\n1) Display the available parking slots \n"
				     + "2)Calculate the total income and the total number of vehicles\n");
			int ord = scanner.nextInt();
			//when user want to show the available slots.
			if(ord == 1) {
				requestAvaliableSlots();
				}
			//when user want to show the total income.
			else if(ord == 2) {
				requestTotalIncome();
				}
			
			//when user choose invalid option.
			else

				System.out.println("Invalid option please try again.");
		}
	//function that ask user for info of the vehicle and return this vehicle.
	public Vehicle getVehicleInfo() {
		
		String mName,mYear;
		int ID;
		float width,depth;
		
		mName = enterModelName();
		
		mYear = enterModelYear();
		
		ID = enterVehicleID();
		
		width = enterVehilceWidth();
		
		depth = enterVehicleDepth();
		
		//create vehicle
		Vehicle newVehicle = new Vehicle(mName,mYear,ID,width,depth);
		//return the vehicle.
		return newVehicle;
		
	}


	//Function that ask user to input Model Name of the vehicle.
	public String enterModelName() {
		
		System.out.println("Please Enter The Model Name:");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String mn = scanner.nextLine();
		return mn; 
	}
	
	//Function that ask user to input Model Year of the vehicle.
	public String enterModelYear() {
		
		System.out.println("Please Enter The Model Year:");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String my = scanner.nextLine();
		return my; 
	}

	//Function that ask user to input ID of the vehicle.
	public int enterVehicleID() {
		
		System.out.println("Please Enter The Vehicle ID:");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int ID = scanner.nextInt();
		return ID;
	}

	//Function that ask user to input the width of the vehicle.
	public float enterVehilceWidth() {
		
		System.out.println("Please Enter The Vehicle Width:");
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextFloat();
	}

	//Function that ask user to input the depth of the vehicle.
	public float enterVehicleDepth() {
		
		System.out.println("Please Enter The Vehicle Depth:");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return scanner.nextFloat();
	}
	//this function will call when the user can't find any available slot
	public void noAvailableSlots() {
		System.out.println("Sorry, There is no available slots.");
	}
	
	
	

	//Function that takes arrayList from garage and displayed it.
	public void requestAvaliableSlots() {
		
		// arrayList to store available slots.
		Garage g = new Garage();
		
		//displaying available Slots.
		displayAvailableSlots( g.getSlots());
		
		
	
	}
	

	//Function to output all available slots in the array list.
	
	public void displayAvailableSlots(ArrayList <Slot> avSlot) {
		Boolean found = false;
		for (Slot i:avSlot) {
			if(i.getAvaliblity()) {
				displaySlot(i);
				found = true;
			}
		}
		if(!found)
			noAvailableSlots();
	}
	
	//Function to output all data about the slot.
	public void displaySlot(Slot s) {
		System.out.println("\n Slot ID: "+ s.getID()+
				           "\n Slot Width: "+ s.getWidth()+
				           "\n Slot Depth: "+ s.getDepth() + "\n");
	}
	
	//Setup Function that appears once when the program launch, to setup the garage data.
	public void setUp() {
		
		//Creating object from garage and manager.
		Garage g =new Garage();
	
		//asking manager to input the garage name and store it.
		System.out.println("Hello in Your parking garage system :)\n");
		
		//asking manager to enter the configuration of the garage.
		int c = enterConfiguration();
		
		Configration confi = new Configration();
		confi.setConfigration(c);
		
		ParkIn p = new ParkIn();
		p.setParkWay(confi.getConfigration());
		
		
		//asking manager to enter the capacity of the garage.
		
		c = enterCapacity();
		
		g.setCapacity(c);
		
		
		//asking manager to enter slots info in the garage.
		ArrayList<Slot> slots = enterSlotsInfo();
		g.setSlots(slots);
		
		//add slots to the garage history
		GarageHistory gH = new GarageHistory();
		gH.addSlots(slots);
	}
	
	
	//function that takes capacity from user and returned it.
	public int enterCapacity() {
		System.out.println("Please Enter the capacity of your Garage");
		int c = scanner.nextInt();
		return c;
	}
	

	//function that takes Configuration from user and returned it.
	public int enterConfiguration() {
		int c = 0;
		while(c!= 1 && c!= 2 ) {
		System.out.println("Please Enter the Configaration\n"
				 + "1)First Fit\n"
				 + "2)Best Fit");
			c= scanner.nextInt();
			if(c!= 1 && c!= 2) {
				System.out.println("invalid option, please try again.\n");
			}
		}
			 return c;
	}
	
	//function to ask manager to enter the Slots info.

	
	//function that takes the slots info from user and returned it.
	public ArrayList<Slot> enterSlotsInfo() {
		
		System.out.println("Please Enter the Slots Info");
		
		ArrayList<Slot> slots = new ArrayList<Slot>();
		Garage g = new Garage();
		int t = g.getCapacity();
		//id for setting the id for each slot.
		int id = 1;
		
		while(t > 0) {
			//asking user to input width and depth for the slot and setting the id.
			System.out.println("\nEnter the information for the Slot ("+ id + "): ");
			System.out.println("\nEnter the Width of this Slot: ");
			float w = scanner.nextFloat();
			System.out.println("Enter the Depth of this Slot: ");
			float d = scanner.nextFloat();
			Slot s = new Slot (id,w,d);
			id++;
			
			//adding this slot to the ArrayList.
			slots.add(s);
			t--;
		}
		//return the slots.
		return slots;
	}
	public void notFound() {
		System.out.println("Invalid ID, Please try again.");
	}
	
	//function to print the receipt to the user.
	public void printReceipt(Vehicle vehicle) {
		System.out.println("Arrival Time: " + vehicle.getArrivalTime());
		System.out.println("\nDeparture Time: " + vehicle.getDepartureTime());
		System.out.println("\nStay Time: " + vehicle.getStayTime());
		System.out.println("\nFess: " + vehicle.getFees());
		
		
	}
	
	//function when user want to park in.
	public void startParkingIn() {
		
		//Declare object from parkIn.
		ParkIn p = new ParkIn();
		
		//calling Park In Function
		p.parkIn();
	}
		
	//function when user want to park out
	public void startParkingOut() {
		
		//Declare object from parkOut.	
		ParkOut p = new ParkOut();
		
		//calling Park Out Function
		p.parkOut();
	}
	
	//function when user want to calculate total income.
	public void requestTotalIncome() {
		
		Garage g = new Garage();
		long tIncome = g.requestTotalIncome();
		long tVehicle = g.requestTotalVehicles();
		displayTotalIncome(tIncome,tVehicle);
		
		}
	//display data.
	public void displayTotalIncome(long ti,long tv) {
		System.out.println("\nTotal Income =  " + ti);

		System.out.println("\nTotal number of Vehicle =  " + tv);
	}
	
	
}
