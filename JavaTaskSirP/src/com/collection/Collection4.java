package com.collection;

import java.util.ArrayList;

public class Collection4
{
	public static void main(String[] args) 
	{
	 ArrayList a=new ArrayList();
	 a.add("monu");
	 a.add("tanay");
	 a.add("priya");
	 a.add("minal");      
	 a.add("neha mam");
	 a.add("ritesh sir");
	 a.add("gaurav sir");
	 
	 ArrayList a1=new ArrayList();
	 a1.add("minal");
	 a1.add("priya");
	 a1.add("enquiry wali mam");
	 
		/* a.retainAll(a1); */   //retainAll method remove all the element of arraylist 2 presents in the arraylist 1 
	// System.out.println(a);
	/*----------------------------------------------------------------------------------*/
		/*
 1.)concept
 
		 * a1.addAll(a1); System.out.println(a1);  //add duplicate data
		 */
/*   2.) Remove Concept     It will remove existing elements of data
	 a1.removeAll(a1);
	 System.out.println(a1);  */
	 
	 /*
	 3) Retain all match data and delete data which does not exist in arralist
	
	 a1.retainAll(a1);
	 System.out.println(a1);   */
	}
}
