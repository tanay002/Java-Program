package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_8 
{
	public static void main(String[] args)
	{
       HashSet s=new HashSet();
       s.add(20);
       s.add(31);
       s.add(45);
       s.add(null);
       s.add(7);
       
       Iterator t=s.iterator();
   /*    s.add(8);*/         // ConcurrentModificationException
       while(t.hasNext())
       {
    	   System.out.println(t.next());
       }
	}
}
