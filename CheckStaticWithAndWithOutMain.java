package com.pre;

public class CheckStaticWithAndWithOutMain {
	
	static {
		System.out.println("This is static..");
	}

	{
		System.out.println("This is initilizer block...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main...");
		new CheckStaticWithAndWithOutMain();
	}
	//Executes static block first then main method..But main method is must in 1.7 version....
}
