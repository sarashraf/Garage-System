import java.util.ArrayList;

class FirstFit implements ParkWay {
	public Boolean selectSlot (Vehicle v,ArrayList<Slot> slots) {
		for(Slot i : slots) {
			//searching for first suitable slot.
			if(i.getAvaliblity() && i.getWidth()>=v.getWidth() 
                                 && i.getDepth()>=v.getDepth())
			{
				i.setAvaliblity(false);
				v.setSlot(i);
				return true;
			}
		}
		//if not found slot.
		return false;
	}
	
}
