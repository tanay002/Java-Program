package com.SynchronizeCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class ArrayListSynchronize1 
{
	public static void main(String[] args)
	{
  List al=new ArrayList();
    al.add("Mango");
    al.add("Banana");
    al.add("Orange");
    al.add("Pineaaple");
    al.add("apple");
    
    al=Collections.synchronizedList(al);
		/*
		 * al.add("chiku"); al.add("Strawberry"); System.out.println();
		 */
    synchronized (al) 
    {
            Iterator it=al.iterator();
            while(it.hasNext())
            {
            	System.out.println(it.next());
            }
    	 
	}
    
	}

}
