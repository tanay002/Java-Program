package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Comparator
{
	public static void main(String[] args) 
	{
		Student c=new Student(102,"Tanay");
		Student c1=new Student(53,"Vinay");
		Student c2=new Student(70,"Ranjeet");
		Student c3=new Student(90,"Sourabh");
		Student c4=new Student(20,"Rahul");

		ArrayList a=new ArrayList();
		a.add(c);
		a.add(c1);
		a.add(c2);
		a.add(c3);
		a.add(c4);
		System.out.println(a);
		System.out.println("");
		System.out.print("Pick Choice Sorting Based on \n1: Id \n2:Name\n");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			Collections.sort(a,new SortById());
			break;
		case 2: 
			Collections.sort(a,new SortByName());
			break;

		default: 
			System.out.println("Invalid Choice");
			break;
		} 
		System.out.println(a);

	}
}
