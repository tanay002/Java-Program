package com.collection;

import java.util.ArrayList;

public class Collection2 
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
	 
	 System.out.println(a);
     boolean j=	 a.remove("ritesh sir");  //return type of remove is boolean
	 System.out.println(a);
     a.remove(5);
	 System.out.println(a);
	 
	 ArrayList a1=new ArrayList();
	 a1.add("minal");
	 a1.add("priya");
	 
	boolean k= a.removeAll(a1);  //return type of removeAll is boolean
	 System.out.println(a);
	 
		/* a.removeAll("monu");  We can't use particular data in removeAll method*/
	}
}
