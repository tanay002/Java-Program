package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
//Does not preserves insertion order
//key can't be duplicate but value can be duplicate
// if we add two keys same then it will replace value of new key from older onces which is stored
public class HashMapTask2
{
	public static void main(String[] args)
	{
		HashMap s=new HashMap();
		s.put(101,"Tanay");
		s.put(50,"Raju");
		s.put(60,"Ravi");
		s.put(50,"Kali linux");
		s.put(90,"Tanny"); //value is replaced from new key value....
		s.put(45,'c');
		s.put(97,105);
		s.put(85,102.9f);
		s.put(89,88.0d);
		//System.out.println(s);

		HashMap s1=new HashMap();
		s1.put(75,"Rajat");
		s1.put(90,"dilipp"); //duplicate key,overrite value from older onces
		s1.put(67,"kuldeep");
		s.put(89,100.0d);
		s.putAll(s1);  
		//if we want to insert other value of different datatype so we have to remove typesafety 
		//typesafety is optional not mandatory

		System.out.println("toString iteration:- ");
		System.out.println(s);
		System.out.println("");

		System.out.println("Iterator Data:- ");
		Set sk=s.entrySet();
		Iterator it=sk.iterator();
		while(it.hasNext())
		{
			Map.Entry m=(Map.Entry) it.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("");
		System.out.println("ForEach Iteration data:-");

		
		  for(Object o:sk) 
		  { 
			  Map.Entry m=(Map.Entry)o;
			  System.out.println(m.getKey()+" "+m.getValue()); 
			 }  
		 
		  /*	System.out.println("");
		
		 * System.out.println("Try Different iteration-");
		 * 
		 * for(Map.Entry mp:s.entrySet()){ //problem in iteration {
		 * 
		 * System.out.println(mp.getKey()+" "+mp.getValue()); }
		 */



		}
	}
