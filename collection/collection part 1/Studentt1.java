package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Studentt1 implements Comparable
{
int rollno;
String name;
 Studentt1(int rollno,String name)
 {
	 this.rollno=rollno;
	 this.name=name;
 }
	
	public int compareTo(Object o) 
	{    Studentt1 s=(Studentt1) o;
	//	return this.rollno-s.rollno;
	return this.name.compareTo(s.name);
	}
	
	public String toString()
	{
		return rollno+" "+name;
	}
	}
class SortById implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
        Studentt1 s1=(Studentt1)o1;
        Studentt1 s2=(Studentt1)o2;
        
		return s1.rollno-s2.rollno;
	}

}

class SortByName implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
        Studentt1 s1=(Studentt1)o1;
        Studentt1 s2=(Studentt1)o2;
        
		return s1.name.compareTo(s2.name);
	}

}
public class Spmee2 
{
public static void main(String[] args) 
{
	TreeSet s=	 new TreeSet();
	Studentt1 s1=new Studentt1(12,"Tanaay");
	Studentt1 s2=new Studentt1(56,"Rahul");
	Studentt1 s3=new Studentt1(162,"Tanaay");
	s.add(s1);
	s.add(s2);
	s.add(s3);
System.out.println(s);

}
}
