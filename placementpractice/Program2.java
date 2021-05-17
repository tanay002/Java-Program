package com.string.placementpractice;

import java.util.Scanner;

public class Program2 
{
	//Reverse string  I am Student-> (Student am I)
	public static void main(String[] args) 
	{
		System.out.println("Enter String:- ");
		Scanner sc=new Scanner(System.in);
		  String s=sc.nextLine();
		StringBuffer s1=new StringBuffer("");
   String s2[]=s.split(" ");
   int size=s2.length;

     for(int i=size-1;i>=0;i--)
     {
    	 s1.append(s2[i]+" ");
     }
     s1.trimToSize();
     System.out.println(s1);
     
	}
}
