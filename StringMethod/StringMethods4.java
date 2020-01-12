package com.StringMethod;

import java.util.Scanner;

public class StringMethods4 
{
	public static void main(String[] args) 
	{  //indexOf
       String m="String concept is important for java developer";
	   System.out.println(m.indexOf('c'));
	   System.out.println(m.indexOf("con"));
	   System.out.println(m.indexOf('o',11));
	   System.out.println(m.indexOf("ava",10));
	  
	   //intern
	   System.out.println("");
	   String g1="Java Developer";
	   String g2=new String("Java Developer");
	   System.out.println(g1==g2);
	   String g3=g2.intern();
	   System.out.println(g3==g1);
	   System.out.println(g2==g3);
	   
	   
	   //isEmpty()
	   System.out.println("");
	   String s="";
	   String s1="java";
	   boolean b=s.isEmpty();
	   System.out.println(b);
	             b=s1.isEmpty();
	             System.out.println(b);
	             
	            Scanner sc=new Scanner(System.in); 
	            String str=sc.nextLine();
	             if(str.length()==0||str.isEmpty())
	             {
	            	 System.out.println("Empty");
	             }
	             else
	             {
	            	 System.out.println("Not empty");
	             }
	   
	}
}
