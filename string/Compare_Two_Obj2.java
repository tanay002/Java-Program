package com.string;

public class Compare_Two_Obj2
{
	public static void main(String[] args) 
	{
/*Comparing Using equals operator,it will content or compare content of two object,
         It will return true if content are same else return false
         Boolean type is boolean
         */
		
		String s="Hello Tanay";  //By Literals
     String s1="Hello Tanay";
     
     String k="Hello";
     System.out.println(s.equals(s1));
     System.out.println(s.equals(k));
     
     ////////////////////////////////////////
     String s2=new String("Hello Tanay");   //By new keywords
     System.out.println(s1.equals(s2));
     System.out.println(s1.equals(k));
     
     
     
	}
}
