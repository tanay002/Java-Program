package com.string;

public class String_by_Literals_and_new 
{
	public static void main(String[] args)
	{ 
		String m="Cool JAVA";  //creating string by java literals 
		char c []={'T','a','n','a','y'};
	      String c1=new String(c);  //converting character array to string
	      
	      String ck=new String("Welcome");
	      
	      System.out.println(m);
	      System.out.println("For c1"+c1);
	      System.out.println(ck);
	      
		String m1="Java is awsome";
		String m2="Java is awsome";
		String m3="Java is awsome";

		System.out.println("M1: "+m1+"\nM2: "+m2+"\nM3: "+m3);
		m1=m1+" and good";
		System.out.println(m1);
	}

}
