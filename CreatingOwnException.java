package com.pre;

import java.util.Scanner;

class AgeException extends Exception{
	AgeException(String message){
		super(message);
	}
}

public class CreatingOwnException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		try {
			if(n > 18 && n < 100) {
				System.out.println("Thanks for coming for voitinhg...");
			}else {
				throw new AgeException("You can't vote baeb");
			}
		}catch(AgeException ae) {
			System.out.println(ae.getMessage() + "Normal Exception...");
		}
		
		finally {
			System.out.println("Thanks...");
		}

	}

}
