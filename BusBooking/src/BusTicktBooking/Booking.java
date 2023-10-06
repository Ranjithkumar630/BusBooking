package BusTicktBooking;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat; 

public class Booking {
	String passengername;
	int BusNo;
	Date date;
	 
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of the passenger: ");
		passengername = scanner.next();
		System.out.println("Enter your BusNo: ");
		BusNo = scanner.nextInt();
		System.out.println("Enter date dd/mm/yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dataformat = new SimpleDateFormat("dd/mm/yyyy");
		try {
			date = dataformat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isAvailable(ArrayList<Booking> bookinges, ArrayList<Bus> buses) {
		// TODO Auto-generated method stub
		int capacity = 0;
		for (Bus bus:buses) {
			if(bus.getBusNo()== BusNo) {
				capacity = bus.getCapacity();
			} 
		}
		int booked = 0;
		for(Booking b:bookinges) {
			if (b.BusNo==BusNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked <capacity? true:false;
	}
	
}
