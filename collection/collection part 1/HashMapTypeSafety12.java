package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTypeSafety12
{
	public static void main(String[] args)
	{
		Map<Integer,String> map=new HashMap();

		map.put(2,"Abhi");
		map.put(10,"Dippu");
		map.put(25,"Naman");
		map.put(46,"Sagar");
		map.put(53,"Tanay");
		map.put(58,"Vinay");

		Set set=map.entrySet();

		Iterator it=set.iterator();
	//If we add another element in map..then the mod count of map differs from mod count of iterator
		//Display ConcurrentModificationException
		while(it.hasNext())
		{
			Map.Entry<Integer,String> itk= (Entry<Integer, String>) it.next();
			System.out.println(itk.getKey()+" "+itk.getValue());
		}
	}
}
