package BusTicktBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) throws Exception {
		
		ArrayList<Bus> Buses = new ArrayList<Bus>();
		ArrayList<Booking> Bookinges = new ArrayList<Booking>();
		
		
		Buses.add(new Bus(1,true,45));
		Buses.add(new Bus(2,false,2));
		Buses.add(new Bus(3,true,70));
		
        int userOpt =1;
        Scanner scanner = new Scanner(System.in);
        for(Bus b:Buses) {
        	b.displayInfo();
        }
        while (userOpt==1) {
        	System.out.println("Enter 1 to Book and 2 to excit");
        	userOpt = scanner.nextInt();
        	if (userOpt==1) {
				Booking booking = new Booking();
				if (booking.isAvailable(Bookinges,Buses)) {
					Bookinges.add(booking);
					System.out.println("your booking is confirmed");
				}
				else {
					System.out.println("Sorry bus is full try another bus or date.");
				}
			}
        }
	}

}
