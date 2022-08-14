import java.util.ArrayList;

class BestFit implements ParkWay {
	public Boolean selectSlot (Vehicle v,ArrayList<Slot> slots) {
		int res = -1;
		float cw = 1000000000,cd=1000000000;
		//searching for the bes fit slot.
		for(Slot i: slots) {
			if(i.getAvaliblity() && i.getWidth()>=v.getWidth() 
					             && i.getDepth()>=v.getDepth()) 
			{
				//if this slot is best fit from previous we will swap it.
				if(i.getWidth() * i.getDepth() < cw * cd) {
					res = i.getID() - 1;
					cw = i.getWidth(); 
					cd = i.getDepth();
				}
			}
		}
		//if there is no available slot.
		if(res==-1) {
			return false;
		}
		else {
			//set slot not available.
			slots.get(res).setAvaliblity(false);
			//set this slot in the car.
			v.setSlot(slots.get(res));
			return true;
		}
	}
}
