package com.string;

public class StringTask
{
public static void main(String[] args) 
{
String s="Java is awsome";

 String s1=s.substring(0,4);
 System.out.println(s1);
 
 String s2=s.replace('a','e');
 System.out.println(s2);
 
 char [] a=s.toCharArray();
 
 for(int i=a.length-1;i>=0;i--)
 {
	 System.out.print(a[i]);
 }
 
 String s23="Java is awsome";
 
 String sss=s23.replaceAll("java","mava");
 System.out.println(sss);
}
}
