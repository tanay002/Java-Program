package com.collections;

import java.util.ArrayList;
import java.util.Collections;

class Studentt implements Comparable
{
int rollno;
String name;
 Studentt(int rollno,String name)
 {
	 this.rollno=rollno;
	 this.name=name;
 }
	
	public int compareTo(Object o) 
	{    Studentt s=(Studentt) o;
	//	return this.rollno-s.rollno;
	return this.name.compareTo(s.name);
	}
	
	public String toString()
	{
		return rollno+" "+name;
	}
	}
public class Spmee 
{
public static void main(String[] args) 
{
ArrayList a=new ArrayList();
Studentt s=new Studentt(10, "tanay");
Studentt s1=new Studentt(3, "rocky");
Studentt s2=new Studentt(20, "cicky");
Studentt s3=new Studentt(5, "yash");
a.add(s);
a.add(s1);
a.add(s2);
a.add(s3);

Collections.sort(a);
System.out.println(a);
}
}
