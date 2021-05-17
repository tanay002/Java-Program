package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DynamicComparatorTaskk
{
	int id;
	String name;
	char grade;

	public DynamicComparatorTaskk(int id,String name,char grade) {

		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	public String toString()
	{
		return ""+id+" "+name+" "+grade;	
	}

	public static void main(String[] args) 
	{
		int id;
		String name;
		String grade;

		System.out.println("Kitne Data insert karna hai:- ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter id  Name   Grade");
		ArrayList a=new ArrayList();
		for(int i=0;i<size;i++)
		{
			id=sc.nextInt();
			name=sc.next();
			grade=sc.next();
			char c=grade.charAt(0);
			DynamicComparatorTaskk t=new DynamicComparatorTaskk(id,name,c);
			
			a.add(t);

		}
		System.out.println("Enter sorting Schenario \n1: Id \n 2: Name \n 3: Grade");

		int ch=sc.nextInt();

		switch(ch)
		{
		case 1: Collections.sort(a,new SortById3());
		System.out.println(a);
		break;
		case 2: Collections.sort(a,new SortByName3());
		System.out.println(a);
		break;
		case 3: Collections.sort(a,new SortByGrade3());
		System.out.println(a);
		break;
		default:System.out.println("Invalid choice");
		System.exit(1);	
		}


	}
}
class SortByName3 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		DynamicComparatorTaskk s1=(DynamicComparatorTaskk) o1;
		DynamicComparatorTaskk s2=(DynamicComparatorTaskk) o2;
		return
				(s1.name).compareTo(s2.name);
	}
}
class SortById3 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		DynamicComparatorTaskk s1=(DynamicComparatorTaskk) o1;
		DynamicComparatorTaskk s2=(DynamicComparatorTaskk) o2;
		return s1.id-s2.id;
	}

}
class SortByGrade3 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		DynamicComparatorTaskk s1=(DynamicComparatorTaskk) o1;
		DynamicComparatorTaskk s2=(DynamicComparatorTaskk) o2;
		char c=s1.grade;
		char c2=s2.grade;
		int k=c;
		int k1=c2;
		return k-k1;
	}
}
