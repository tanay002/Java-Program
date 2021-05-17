package com.collection;

import java.util.ArrayList;

public class CollectionTest 
{
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(1);
	a.add(2);
	a.add(3);
	ArrayList a1=new ArrayList();
	a1.add(1);
	a1.add(3);
	a1.add(4);
	a1.add(5);
		/*
		 * a.removeAll(a1); System.out.println(a); System.out.println(a1);
		 */
	
	a.retainAll(a1);
	System.out.println(a);
	System.out.println(a1);
}
}
