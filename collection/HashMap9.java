package com.collection;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap9
{
	public static void main(String[] args) 
	{
        HashMap hm=new HashMap();
        hm.put(101,"tanay");
        hm.put(201,"Rajat");
        hm.put(301,null);
                Set set=hm.entrySet(); 
        
         Iterator it=set.iterator();
         while(it.hasNext())
         {
        	 Map.Entry map=(Entry) it.next();
        	System.out.println(map.getKey()+" "+map.getValue());
         }
        
	}
}
