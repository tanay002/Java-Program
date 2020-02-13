package com.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap13
{  
	//Fail Safe 3 ConcurrentHashMap
	public static void main(String[] args) 
	{
		ConcurrentHashMap<Integer,String> m=new ConcurrentHashMap();
		m.put(202,"kk");
		m.put(203,"llll");
		Set set1= m.entrySet();
		Iterator it1=  set1.iterator();
		m.put(207,"why");
		while(it1.hasNext())
		{
			Map.Entry<Integer,String> itk1= (Entry<Integer, String>) it1.next();
			System.out.println(itk1.getKey()+" "+itk1.getValue());
		}	      
	}
}
