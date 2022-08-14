


public class Receipt {
	
	//Function to calculate the Fees.
	public void calcFees(Vehicle vehicle){
	    String aTime=vehicle.getArrivalTime();
	    String dTime=vehicle.getDepartureTime();
	    
	    // get the arrival time in integer
	    double aH=aTime.charAt(0)-48;
	    aH*=10;
	    aH+=(aTime.charAt(1)-48);
	    
	    
	    
	    // get the arrival minute in integer
	    double aM=aTime.charAt(3)-48;
	    aM*=10;
	    aM+=(aTime.charAt(4)-48);
	    // minute into hours
	    aM/=60;
	    aH+=aM;

	    
	    // get the departure time in integer
	    double dH=dTime.charAt(0)-48;
	    dH*=10;
	    dH+=(dTime.charAt(1)-48);
	    
	    // get the departure minute in integer
	    double dM=dTime.charAt(3)-48;
	    dM*=10;
	    dM+=(dTime.charAt(4)-48);
	    
	    // minute into hours
	    dM/=60;
	    dH+=dM;
	    double ans=dH-aH;
	    ans=Math.ceil(ans);
	    vehicle.setStayTime(ans);
	    int temp=(int)ans;
	    
	    // the fees = departure time - arrival time * 5 (dH-aH *5)
	    
	    temp*=5;
	    
	    vehicle.setFees(temp);
	    
	    
	  }
	
	
}






