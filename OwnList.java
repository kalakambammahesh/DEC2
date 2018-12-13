package com.pre;

import java.util.Arrays;

public class OwnList<E> {
	private static final int initial_capacity = 10;
	private Object[] elements;
	private int size = 0;
	
	OwnList(){
		elements = new Object[initial_capacity];
	}

	public void add(E e) {
		if(size == elements.length) {
			ensureCap();
		}
		elements[size++] = e;
	}
	private  void ensureCap() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	public E getE(int i) {
		if(i >= elements.length || i < 0) {
			throw new ArrayIndexOutOfBoundsException("Index " + i + " size " + i);
		}
		return (E) elements[i];
	}
}
