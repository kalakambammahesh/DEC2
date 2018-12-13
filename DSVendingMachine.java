package com.pre;

import java.util.Scanner;

public class DSVendingMachine {
	private final static Scanner sc = new Scanner(System.in);
	static int welcome() {
		System.out.println("WelCome Please Enter the Item to Buy.");
		System.out.println("Coke : 1 Cost : 50");
		System.out.println("Water : 2 Cost : 35");
		System.out.println("Coffee : 3 Cost 45");
		System.out.println("Exit : 0");
		
		int option = sc.nextInt();
		return option;
	}
	
	static int amount(int option) {
		int amount = 0;
		int coke = 50, water = 35, coffee = 45;
		int checkAmount = 0;
		if( option == 1) {
			checkAmount = coke;
		}else if(option == 2) {
			checkAmount = water;
		}else checkAmount = coffee;
		while(amount >= checkAmount) {
			int n = sc.nextInt();
			if(n % 5 == 0 || n % 10 == 0 || n % 20 == 0) {
				amount += n;
			}else {
				System.out.println("Plese Enter only 5 or 10 or 20 Denominations...");
				amount(option);
				break;
			}
		}
		return amount;
	}
	public static void main(String[] args) {
		
		
		int option = welcome();
		
		System.out.println("Please Enter The Amount to buy Specified Item.");
		
		int amount = amount(option);
		int coke = 0;
		
		while(option > 0) {
			switch(option) {
			case 1:
				if(amount < 50) {
					System.out.println("Please Enter Enough amount to buy");
					amount += sc.nextInt();
				}else {
					amount -= 50;
					System.out.println("Please collect you item Coke and Change " + amount);
				}
				option = welcome();
				break;
			case 2:
					if(amount < 35) {
						System.out.println("Please Enter Enough amount to buy");
						amount += sc.nextInt();
					}else {
						amount -= 35;
						System.out.println("Please collect you item Water and Change " + amount);
					}
					option = welcome();
					break;
			case 3 :
				if(amount < 45) {
					System.out.println("Please Enter Enough amount to buy");
					amount += sc.nextInt();
				}else {
					amount -= 45;
					System.out.println("Please collect you item Coke and Change " + amount);
				}
				option = welcome();
				break;
			case 4 :
				System.out.println("Thanks...");
				option = 0;
				break;
			default :
				System.out.println("Pleae Enter a valid Option...");
				option = welcome();
			}
		}
	}
}
