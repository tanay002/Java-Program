package com.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
//The best schenario is to use directly TreeSet insteads of using hashSet and then passing data of HashSet in TreeSet .......
//because HashSet does not preserves insertion order...and can't perform sorting in hashset using comparable and comparator.
class Employee22 implements Comparable
{
	int id;
	String name;

	Employee22(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name;
	}
	public int compareTo(Object o)
	{
		Employee22 e=(Employee22)o;
		return this.id - e.id;
	}

	public int hashCode()
	{
		return (id+""+name).hashCode();
	}

	public boolean equals(Object o)
	{
		if(this.hashCode()==o.hashCode())
			return true;
		else
			return false;
	}
}
public class HashSetTask_SortTryComparator3 
{

	public static void main(String[] args) 
	{
		Employee22 e=new Employee22(2,"Tanay");
		Employee22 e1=new Employee22(3,"Nikhil");
		Employee22 e2=new Employee22(4,"Priya");
		Employee22 e3=new Employee22(1,"Minal");
		Employee22 e4=new Employee22(2,"Tanay");

		HashSet s=new HashSet();
		s.add(e);                    //We can also sort data by comparator ..by using same process
		s.add(e1);
		s.add(e2);                                   
		s.add(e3);
		s.add(e4);

		System.out.println("Unsorted Data:- \n"+s);
		
		System.out.println("");
		TreeSet s1=new TreeSet(new SorttById());
		s1.addAll(s);
		System.out.println("Sorted Data based on Id:- \n"+s1);

		System.out.println("");
		TreeSet s2=new TreeSet(new SorttByName());
		s2.addAll(s);
		System.out.println("Sorted Data based on Name:- \n"+s2);

		//we have to overite toString method to see content of user defined object passed in HashSet 
		//wrapper class ne toString class ko overrite karke rakha hai
	}

}


class SorttById implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Employee22 e1=(Employee22) o1;
		Employee22 e2=(Employee22) o2;
		return e1.id-e2.id;
	}
}	
	class SorttByName implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			Employee22 e1=(Employee22) o1;
			Employee22 e2=(Employee22) o2;
			return e1.name.compareTo(e2.name);
		}
}