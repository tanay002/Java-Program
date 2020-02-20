package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 
{
	public static void main(String[] args) 
	{
    LinkedList a=new LinkedList();
    a.add("Tanay");
    a.add("Saxena");
    a.add("Dhruv");
    a.add(102);
    a.add(14.0f);
    a.add('d');
    a.add("Saxena");
    int size=a.size();
    System.out.println("Iterator");
       Iterator it=a.iterator();
       while(it.hasNext())
       {
    	   System.out.println(it.next());
       }
       System.out.println("");
       
       System.out.println("Enhanced loop");
       for(Object o:a)
       {
    	   System.out.println();
       }
       System.out.println();
       System.out.println("Using Get method");
       for(int i=0;i<size;i++)
       {
    	   System.out.println(a.get(i));
       }
       System.out.println();
       System.out.println("toString");
       System.out.println(a);
	}
}
