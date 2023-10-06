package BusTicktBooking;

public class Bus {
      private int BusNo;
      private boolean ac;
      private int capacity;
public Bus(int busNo, boolean ac, int capacity) {
	super();
	BusNo = busNo;
	this.ac = ac;
	this.capacity = capacity;
   }
public int getBusNo() {
	return BusNo;
}
public void setBusNo(int busNo) {
	BusNo = busNo;
}
public boolean isAc() {
	return ac;
}
public void setAc(boolean ac) {
	this.ac = ac;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
         public void displayInfo() {
        	 System.out.println("BusNo:" + BusNo + "ac:" + ac + "Total capacity:" + capacity);
         }
 
}
