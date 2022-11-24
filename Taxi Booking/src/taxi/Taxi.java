package taxi;

import java.util.List;

public class Taxi {

	int taxiCount = 0;
	int id;
	boolean booked;
	char currentspot;
	int freeTime;
	List<String> trips;

	public Taxi() {
		booked = false;
		currentspot = 'A';
		freeTime = 6;
		taxiCount = taxiCount + 1;
		id = taxiCount;
//		System.out.println("id"+this.id+" curnt soprt "+this.currentspot+" time"+time);
	}
//	public setDetails() {
//		
//	}

}
