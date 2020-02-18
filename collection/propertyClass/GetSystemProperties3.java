package com.propertyClass;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class GetSystemProperties3 
{
	public static void main(String[] args) 
	{
		Properties ps=System.getProperties();
		Set s=ps.entrySet();
		Iterator it =s.iterator();
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey()+"      "+mp.getValue());
		}
	}
}
