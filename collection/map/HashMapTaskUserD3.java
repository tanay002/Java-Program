package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student
{
	int id;
	String name;

	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	public String toString()
	{
		return id+" "+name;
	}
	
	public int hashCode()
	{
		return (id+""+name).hashCode();
	}
	
	public boolean equals(Object o)           //
	{
		if(this.hashCode()==o.hashCode())
		return true;
		else
			return false;
		}
}
public class HashMapTaskUserD3 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(101,"raju"); 
		Student s2=new Student(91,"Rajat");  //toString overriding is necessary to see content inside object else 
		Student s4=new Student(95,"Vinay");         //it will show "packagename.classname.hexadecimal of hashcode"
		Student s3=new Student(75,"Tanay"); 
		Student s5=new Student(110,"Anil"); //duplicate data is allowed
		Student s6=new Student(80,"Raj"); 
		Student s7=new Student(110,"Anil"); 
		Student s8=new Student(70,"Mahesh"); 
		Student s9=new Student(95,"Vinay");  //HashMap me data duplicate ho sakta hai par key duplicate nhi ho sakti...whether we override 
                                               //hashcode and equals method
		HashMap hm=new HashMap();
		hm.put(1,s1);
		hm.put(1,s2);
		hm.put(2,s3);  //if two values of object is same but key is different it will insert both values. 
		                 //if two values of object is same and key is same it will overrite value of last inserted once
		hm.put(3,s4);         //if two values of object is different but key is same then it will overrite value of last inserted once
		hm.put(4,s5);         
		hm.put(5,s6);
		hm.put(6,s7);
		hm.put(7,s8);
		hm.put(8,s8);
		hm.put(9,s9); 
		System.out.println("Key Value");
		System.out.println(hm.toString());
		System.out.println("");

		System.out.println("Iterate data from iterator");
		Set s=hm.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry) it.next();
			System.out.println(mp.getKey()+" "+mp.getValue());
		}
        System.out.println("");
		System.out.println("Iterate data from forEach loop");
		for(Object o:s) 
		  { 
			  Map.Entry m=(Map.Entry)o;
			  System.out.println(m.getKey()+" "+m.getValue()); 
			 }  
		
      System.out.println("");
		/*
		 * for(Map.Entry m:hm.entrySet()) {                   problem in iteration
		 * System.out.println(m.getKey()+" "+m.getValue()); }
		 */
	}
}
