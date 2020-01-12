package com.StringMethod;

public class StringMethods2 
{
	public static void main(String[] args)
	{
		//endWith method
     String s="This is my coding and programming";
     boolean b=s.endsWith("programming");
     System.out.println(b);
     b=s.endsWith("is");
     System.out.println(b+"\n");
	
	  //equals()
     String s1="This is my coding and programming";
     String s2="This is coding and programming";
     String s3="This is my Coding and programming";
     
     Boolean k=s1.equals(s);
     System.out.println(k);
     Boolean k1=s2.equals(s);
     System.out.println(k1);
     
     //equalsIgnoreCase()
     Boolean k2=s3.equalsIgnoreCase(s1);
     System.out.println(k2);
     
     //format method
     
     System.out.println(String.format("String is %f",21.00));
     System.out.println(String.format("%d", 101));          
     System.out.println(String.format("%s", "Amar Singh"));  
     System.out.println(String.format("%x", 101));          
     System.out.println(String.format("%c", 'c'));   
     System.out.println(String.format("%o", 123));
     System.out.println("\n");
     System.out.println(String.format("|%10d|", 101));    
     System.out.println(String.format("|%-10d|", 101));   
     System.out.println(String.format("|% d|", 101));  
	
	}
}
