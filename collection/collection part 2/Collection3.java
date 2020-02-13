package com.collection;

import java.util.ArrayList;

public class Collection3 
{
	public static void main(String[] args) 
	{
	 ArrayList a=new ArrayList();
	 a.add("monu");
	 a.add("tanay");
	 a.add("priya");
	 a.add("minal");      //Doi delete kar dega data removeAll method...........
	 a.add("minal");
	 a.add("neha mam");
	 a.add("ritesh sir");
	 a.add("gaurav sir");
	 
	 System.out.println(a);
	 a.remove("ritesh sir");
	 System.out.println(a);
     a.remove(5);
	 System.out.println(a);
	 
	 ArrayList a1=new ArrayList();
	 a1.add("minal");
	 a1.add("priya");
	 
	 a.removeAll(a1);
	 System.out.println(a);
	
	}
}
