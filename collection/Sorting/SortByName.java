package com.collections;

import java.util.Comparator;

public class SortByName implements Comparator
{
	public int compare(Object o,Object o1)
	{
		Student s=(Student)o;	
		Student s1=(Student)o1;	

		return s.sName.compareTo(s1.sName);
	}
}
