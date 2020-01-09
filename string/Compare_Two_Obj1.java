package com.string;

public class Compare_Two_Obj1
{
	public static void main(String[] args) 
	{
/*Comparing Using  == operator,it will check on hashcode,
         and two object hashcode is always different*/
		
		String s="Hello Tanay";  //By Literals
     String s1="Hello Tanay";
     String k="Hello";
     System.out.println(s==s1);
     System.out.println(s==k);
     
     ////////////////////////////////////////
     String s2=new String("Hello Tanay");   //By new keywords
     System.out.println(s1==s2);
     System.out.println(s2==k);
     
     
     
	}
}
