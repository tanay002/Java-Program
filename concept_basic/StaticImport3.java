package com.basics.startup;
import static java.lang.Integer.MAX_VALUE; //2nd priority
import static java.lang.Byte.*; //3rd priority
public class StaticImport3
{
	 static int MAX_VALUE=100; //1st priority
public static void main(String[] args) 
{ 
	System.out.println(MAX_VALUE);
}
}
