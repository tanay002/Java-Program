package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList_Iteration2
{
	public static void main(String[] args)
	{
		LinkedList al=new LinkedList();
        System.out.println("Enter total no of element:- ");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        for(int i=0;i<no;i++)
        {
        	al.add(sc.next());
        }
       
        
	//Iteration of LinkedList
	
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