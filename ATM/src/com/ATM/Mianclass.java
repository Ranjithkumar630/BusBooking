package com.ATM;

import java.util.Scanner;

public class Mianclass {

	public static void main(String[] args) {
		 
		ATMoperationsInterface op = new ATMoperationsInterface2();
		int ATMnumber = 888500;
		int ATMpin = 8520;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your ATM number : ");
		int atmnumber = s1.nextInt();
		System.out.println("Enter your ATM pin : ");
		int atmpin = s1.nextInt();
		if ((ATMnumber==atmnumber)&&(ATMpin==atmpin)) {
			while (true) {
				System.out.println("1.view avilable Balances\n2.Withdeaw Amount\n3.Deposit Amount\n4.ministatment\n5.Exict applications");
				System.out.println("Enter your choice :");
				int s2 = s1.nextInt();
				if (s2==1) {
					op.viewBalance();
				}
				else if (s2 == 2) {
					System.out.println("Enter your Amount....withdraw");
					double withdrawAmount = s1.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}
				else if (s2 == 3) {
					System.out.println("Enter Amount to Deposit : ");
					double depositAmount = s1.nextDouble();//5000
					op.depositAmount(depositAmount);
				}
				else if (s2 == 4) {
					op.viewMinistatement();
				}
				else if (s2 == 5) {
					System.out.println(" plz collect your ATM card\n thank you for using ATM");
					System.exit(0);
				}
				else {
					System.out.println("plz enter your carrect choice");
				}
			}
		}
		else {
			System.out.println("Incorrect ATM number or pin check it ones");
			System.exit(0);
		}

	}

}
