package com.string;

public class Compare_Two_Obj3
{
	public static void main(String[] args) 
	{
/*Comparing Using compareTo method,it will content or compare content of two object,
         It will return 0 if content are same else return +ve or -ve no
         Boolean type is boolean
         */
		
		String s="Hello Tanay";  //By Literals
     String s1="Hello Tanay";
     
     String k="Hello";
     System.out.println(s.compareTo(s1));
     System.out.println(s.compareTo(k));
     
     ////////////////////////////////////////
     String s2=new String("Hello Tanay");   //By new keywords
     System.out.println(s1.compareTo(s2));
     System.out.println(s1.compareTo(k));
     
     
     
	}
}
