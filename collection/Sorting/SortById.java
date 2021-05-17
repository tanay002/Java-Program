package com.collections;

import java.util.Comparator;

public class SortById implements Comparator
{
	public int compare(Object o,Object o1)
	{
		Student s=(Student)o;	
		Student s1=(Student)o1;	

		return s.sId-s1.sId;
	}
}
