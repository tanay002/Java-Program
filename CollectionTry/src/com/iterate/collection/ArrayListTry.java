package com.iterate.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListTry
{
	public static void main(String[] args)
	{
    ArrayList s=new ArrayList();
   
    s.add(20);
    s.add(10);
    s.add(30);
    s.add(20);
    s.add(80);
    s.add(90);
    HashSet sk=new HashSet();
    sk.add(s);
    System.out.println(sk);
    
     Iterator it=s.iterator();
     //s.remove(1); //concurrent modification exception     1
    // it.remove(); //IllegalStateException                 2
     while(it.hasNext())
     {  //s.remove(1); //concurrent modification exception     3
    	    // it.remove(); //IllegalStateException           4
    	 System.out.println(it.next());
    	 //s.remove(1);  //20 ConurrentModificationException       5
    	 it.remove();
     }
     //    s.remove(1);  //Index out of bound ..kyuki iterator ki remove method ne pahle hi data nikal diya arraylist ka
    System.out.println(s); //output []
	}
}
