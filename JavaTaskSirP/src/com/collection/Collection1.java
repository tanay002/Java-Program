
package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection1 
{ 
	
	@Override
	public String toString() {
		return "Collection1 [name=" + name + "]";
	}
	
	private String name;
	Collection1(String name)
	{
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Collection1 c=new Collection1("tanay");
		Collection1 c1=new Collection1("anay");
		Collection1 c2=new Collection1("nay");
		ArrayList a=new ArrayList();
		a.add(c);
		a.add(c1); //class com.collection.Collection1 cannot be cast to
		a.add(c2);
		
		Collections.sort(a);
		System.out.println(a);
		
/*------------------------------------------------------------------------*/

		
		
		
	/*
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
		
S		a.add(a1);                       //Last me data insert karega kisi  bhi arraylist me
		a.addAll(a1); 
		a.addAll(2,a1);                    //insert data based on index
		*//*
		 * Iterator it= a.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
	}
}
