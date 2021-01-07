package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateList
{
	public static void main(String[] args)
	{
         List list=new ArrayList();
         
         list.add(20);
         list.add(21);
         list.add(22);
         
         Iterator it=list.iterator();
         while(it.hasNext())
         {
        	 /*
        	 list.remove(1);  Concurrent Modification Exception in both case
            Integer i=new Integer(21);
             list.remove(i);   
             */
        	 System.out.println(it.next());
         }
	}
}
