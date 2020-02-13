package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection1 
{
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add("Tanay");
		a.add(123);
		a.add('c');
		a.add(null);
		a.add(12.4f);

		ArrayList a1=new ArrayList();
		a1.add("kalo");
		a1.add('z');
		a1.add(12);
		
		a.add(a1);                       //Last me data insert karega kisi  bhi arraylist me
		a.addAll(a1); 
		a.addAll(2,a1);                    //insert data based on index
		/*
		 * Iterator it= a.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
	}
}
