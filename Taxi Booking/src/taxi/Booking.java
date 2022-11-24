package taxi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Booking {

	public static ArrayList<Taxi> getFreeTaxi(List<Taxi> taxis, char pickupPoint, int pickuptime) {
		ArrayList<Taxi> freeTaxi = new ArrayList<>();
		for (Taxi t : taxis) {
			if (t.freeTime <= pickuptime
					&& Math.abs((t.currentspot - '0') - (pickupPoint - '0')) <= t.freeTime - pickuptime) {
				freeTaxi.add(t);
			}
		}

		return freeTaxi;
	}

	public static List<Taxi> createTaxi(int n) {
		List<Taxi> taxis = new ArrayList<Taxi>();
		for (int i = 0; i < n; i++) {
			Taxi t = new Taxi();
			taxis.add(t);
		}
		return taxis;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Taxi> taxis = createTaxi(4);
		int id = 1;
		while (true) {
			System.out.println("press 1 booking");
			System.out.println("press 2 taxi details");

			int n = scan.nextInt();
			switch (n) {
			case 1: {
				int customerId = id;
				System.out.println("Enter the pickup point");
				char pickupPoint = scan.next().charAt(0);
				System.out.println("Enter the drop point");
				char dropPoint = scan.next().charAt(0);
				System.out.println("Enter the pickup time");
				int pickupTime = scan.next().charAt(0);

				if (pickupPoint < 'A' || pickupPoint > 'F' || dropPoint < 'A' || dropPoint > 'F') {
					System.out.println("Enter the valid pickup point A,B,C,D,E,F");
					return;
				}
				ArrayList<Taxi> freeTaxi = getFreeTaxi(taxis, pickupPoint, pickupTime);

			}
			}
		}

	}

}
