
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//this class for calculate the time.
public class CalcTime {
	
	//set the arrival time.
	public void setArrivalTime(Vehicle v) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
		   LocalDateTime now = LocalDateTime.now();
		v.setArrivalTime(dtf.format(now));
		
	}
	
	//set the departure time.
	public void setDepartureTime(Vehicle v) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
		   LocalDateTime now = LocalDateTime.now();
		v.setDepartureTime(dtf.format(now));
		
	}
}
