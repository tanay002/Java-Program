package com.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap15 
{
	public static void main(String[] args) 
	{
		Map<Integer,Integer> m=new TreeMap<Integer,Integer>();
		m.put(102,90);
		m.put(112,190);
		m.put(50,70);
		m.put(45,85);
		m.put(60,160);

		Set s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry itk1= (Map.Entry) it.next();
			System.out.println(itk1.getKey()+" "+itk1.getValue());
		}
	}
}