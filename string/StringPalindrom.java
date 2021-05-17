package com.string;

public class StringPalindrom
{
public static void main(String[] args) 
{
String s="abba";

String temp="";
/*int []a =new int[3];
int size=a.length;
*/
for(int i=s.length()-1;i>=0;i--)
{
	temp=temp+s.charAt(i);
}
if(s.equals(temp))
	System.out.println("String is palindrom");
else
	System.out.println("Not palindrom");
}
}
