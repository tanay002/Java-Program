package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class Vector_Iterator3
{
	public static void main(String[] args)
	{
        Vector al=new Vector();
		al.add(5);
		al.add("Tanay");
		al.add('c');
		al.add(null);
        
	//Iteration of Vector by Enumeration
		System.out.println("Iteration:- By Enumeration");
		Enumeration e=al.elements(); //Legacy Iterator
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
	 
        //1. by "get" Method
        System.out.println("Iteration:- get Method");
	for(int i=0;i<al.size();i++)
	{
		System.out.print(al.get(i)+" ");
	}
	
	System.out.println("");
	//2. forEach
	System.out.println("Iteration:- ForEach");
	for(Object ob:al)   //collection Interface ne toString method ko overwrite karke rakha hai..
	{
		System.out.print(ob+" ");
	}
	System.out.println(" ");
	for(Object ob:al)  //It internally calculate the Linkedlist size before executing program
	{
		System.out.println(al);  //To isme jitna data honga(size)....utni baar chalega [all data of entire object]
	}
	
	System.out.println("");
	//3. toString
	System.out.println("Iteration:- toString");
	System.out.println(al);

	//4. Iterator
	System.out.println("");
	System.out.println("Iteration:- by Iterator");
	Iterator it=al.iterator();
	      
	while(it.hasNext())  //it checks mod count of array list and iterator if..it is equal it send in the while loop else it
		                             //will exit
	{
	System.out.print(it.next()+" ");	
	}
	
	//5. ListIterator 
	
	System.out.println("");
	System.out.println("Iteration:- by ListIterator");
	ListIterator it1=al.listIterator();
	
	while(it1.hasNext())           
	{
	System.out.print(it1.next()+" ");	
	}
	System.out.println("");
	
	while(it1.hasPrevious())           
	{
	System.out.print(it1.previous()+" ");	
	}
	
	}

}