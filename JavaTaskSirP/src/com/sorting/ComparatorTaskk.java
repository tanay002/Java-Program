package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ComparatorTaskk
{
	int id;
	String name;
	char grade;

	public ComparatorTaskk(int id,String name,char grade) {

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
		ComparatorTaskk t=new ComparatorTaskk(101,"tanay",'B');
		ComparatorTaskk t1=new ComparatorTaskk(85,"ravi",'D');
		ComparatorTaskk t2=new ComparatorTaskk(90,"raja",'A');
		ComparatorTaskk t3=new ComparatorTaskk(75,"kaka",'C');
		ArrayList a=new ArrayList();
		a.add(t);
		a.add(t1);
		a.add(t2);
		a.add(t3);
		System.out.println("Enter sorting Schenario \n1: Id \n 2: Name \n 3: Grade");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();

		switch(c)
		{
		case 1: Collections.sort(a,new SortById2());
		System.out.println(a);
		break;
		case 2: Collections.sort(a,new SortByName2());
		System.out.println(a);
		break;
		case 3: Collections.sort(a,new SortByGrade2());
		System.out.println(a);
		break;
		default:System.out.println("Invalid choice");
		System.exit(1);	
		}

	}
}

class SortByName2 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		ComparatorTaskk s1=(ComparatorTaskk) o1;
		ComparatorTaskk s2=(ComparatorTaskk) o2;
		return (s1.name).compareTo(s2.name);
	}
}
class SortById2 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		ComparatorTaskk s1=(ComparatorTaskk) o1;
		ComparatorTaskk s2=(ComparatorTaskk) o2;
		return s1.id-s2.id;
	}

}
class SortByGrade2 implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		ComparatorTaskk s1=(ComparatorTaskk) o1;
		ComparatorTaskk s2=(ComparatorTaskk) o2;
		char c=s1.grade;
		char c2=s2.grade;
		int k=c;
		int k1=c2;
		return k-k1;
	}
}
