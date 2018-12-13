package com.pre;

class Parent{
	public void display() {
		System.out.println("This is Parent..");
	}
	
	}

class Child extends Parent{
	public void display() {
		System.out.println("This is child..");
	}
	public void display2() {
		System.out.println("Child display2..");
	}
}

public class InheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p =  new Child();
		//((Child)p).display();
		p.display();
		((Child) p).display2();
	}

}
