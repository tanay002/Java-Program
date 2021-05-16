package com.iterate.collection;

import java.util.Scanner;

public class Try
{ 
	static char ch;
	public static void main(String[] args) 
	{  
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to insert Number y/n");
		ch=sc.next().charAt(0);
		
		int num=0;
		do
		{
			if(ch=='y'||ch=='Y')
			num=num+sc.nextInt();
			else
				break;
			System.out.println("Do you want to insert Number y/n");
			ch=sc.next().charAt(0);
		}
		while(ch=='y'||ch=='Y');
		
		System.out.println("Sum is num "+num);
	}
}
