package com.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateList2
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
          it.remove();  //IllegalStateException
        	 System.out.println(it.next());
         }
	}
}
