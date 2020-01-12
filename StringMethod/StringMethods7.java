package com.StringMethod;

public class StringMethods7 
{
	public static void main(String[] args) 
	{  //replace
		String s1="java is a very popular language and website to learn is tanayjava.com";  
		String replaceString=s1.replace('a','e');
		System.out.println(replaceString); 

		String s="This is awsome concepts and java is wonderfull language";
		int i=s.length();
		System.out.println(i);

		s=s.replace('i','j');
		System.out.println(s);
		s=s.replace("java","c");
		System.out.println(s);
  //replaceAll
           s1=s1.replaceAll("is","ok");
           System.out.println(s1);
	}
}
