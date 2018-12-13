package com.pre;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestOwnList {

	@Test
	void testOwnList() {
		OwnList<Integer> list = new OwnList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//assertTrue(1 == list.getE(1));
		//assertTrue(2 == list.getE(2));
		System.out.println(list.getE(1));
		System.out.println(list.getE(0));
		
		System.out.println(list.getE(6));
		System.out.println(list.getE(100));
		System.out.println(list.getE(-1));
	}

}
