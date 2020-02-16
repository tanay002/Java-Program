package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//Does not preserves insertion order
//key can't be duplicate but value can be duplicate
// if we add two keys same then it will replace value of new key from older onces which is stored
public class HashMapTask1
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> s=new HashMap<Integer, String>();
		s.put(101,"Tanay");
		s.put(50,"Raju");
		s.put(60,"Ravi");
		s.put(50,"Kali linux");
		s.put(90,"Tanny"); //value is replaced from new key value....

		/* System.out.println(s); */

		HashMap<Integer,String> s1=new HashMap<Integer, String>();
		s1.put(75,"Rajat");
		s1.put(90,"dilipp"); //duplicate key,overrite value from older onces
		s1.put(67,"kuldeep");
		//s1.put(77,102); Can't insert integer type value because we have specify in type Safety that value should be of String type
		s.putAll(s1);  //jo type safety di hai wali data insert karna padega....
		//if we want to insert other value of different datatype so we have to remove typesafety 
		System.out.println("toString Data Iteration");
		System.out.println(s.toString());

		Set set=s.entrySet();
		Iterator it=set.iterator();
		System.out.println("");
		System.out.println("Iterator Data:- ");
		while(it.hasNext())
		{
			Map.Entry m= (Map.Entry)it.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("");
		System.out.println("ForEach iterator-");
		Set sk=s.keySet();
		for(Object o:sk)
		{
			System.out.println(s.get(o));
		}
           System.out.println("");
		System.out.println("Try Different iteration-");
		
		   for(Map.Entry mp:s.entrySet())
		   {
			   System.out.println(mp.getKey()+" "+mp.getValue());
		   }
	}
}
