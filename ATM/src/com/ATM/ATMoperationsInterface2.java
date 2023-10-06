package com.ATM;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class ATMoperationsInterface2 implements ATMoperationsInterface {

	
	ATM atm = new ATM();
	Map<Double, String> minstatment = new HashMap<>();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balance is : " + atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		if (withdrawAmount<=atm.getBalance()) {
			minstatment.put(withdrawAmount, "Amount withdrawn");
			System.out.println( "plz collect your cash......." + withdrawAmount);
			atm.setBalance(atm.getBalance()-withdrawAmount);
			viewBalance(); 
		}
		else {
			System.out.println("Insufficient Balances");
		}
	}

	@Override
	public void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		minstatment.put(depositAmount, "depositAmount");
		System.out.println(depositAmount+"depositAmount Successfully add...........");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance(); 
	}

	@Override
	public void viewMinistatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double, String> m:minstatment.entrySet()){
			System.out.println(m.getKey()+""+ m.getValue());
		}
		
		
	}

}
