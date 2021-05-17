package com.string.placementpractice;

import java.util.Scanner;

public class Program1 
{
	//Reverse string
	public static void main(String[] args) 
	{
		System.out.println("Enter String:- ");
		Scanner sc=new Scanner(System.in);
		  String s=sc.nextLine();
		StringBuffer s1=new StringBuffer("");
     int size=s.length();
     for(int i=size-1;i>=0;i--)
     {
    	 s1.append(s.charAt(i));
     }
     System.out.println(s1);
	}
}
