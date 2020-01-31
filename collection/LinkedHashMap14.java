package com.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMap14
{
	public static void main(String []args)
	{
		Map<Integer,String> lhm=new LinkedHashMap();
		lhm.put(707,"Tanay");
		lhm.put(709,"Kumar");
		lhm.put(711,"Saxena");
		Set set1= lhm.entrySet();
		Iterator it1=  set1.iterator();
		while(it1.hasNext())
		{
			Map.Entry<Integer,String> itk1= (Entry<Integer, String>) it1.next();
			System.out.println(itk1.getKey()+" "+itk1.getValue());
		}

	}
}
