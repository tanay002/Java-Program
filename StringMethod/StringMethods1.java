package com.StringMethod;

public class StringMethods1 
{
	public static void main(String[] args)
	{
		String m="Java is awsome language and has amazing concept";
		char [] ch={'T','a','n','a','y','S','a','x','e','n','a'};
		String k=new String(ch);
       
		//Concat
       m=m.concat(" to study");
       System.out.println(m);
       
       //charAt
      System.out.println(m.charAt(10));
    System.out.println(k.charAt(8));
    
    //compareTo and compareToIgnoreCase
    String m1="Java is awsome language and has Amazing concept to study";
    
   System.out.println(m.compareTo(m1));
   System.out.println(m.compareToIgnoreCase(m1));
   
   Boolean b=m1.contains("is");
   Boolean b1=m1.contains("Javaa");
   System.out.println(b);
   System.out.println(b1);
      
	}
}
