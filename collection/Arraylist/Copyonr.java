package com.collection;


import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Copyonr
{
public static void main(String[] args) {
	

	CopyOnWriteArrayList lst2=new CopyOnWriteArrayList();
	lst2.add(20);
	lst2.add(21);
	lst2.add(22);
	lst2.add(24);
	
//iterator is failfast for Alist,LL, hashset,LHS,hm,lhm, vector
	Iterator it =lst2.iterator();
	  lst2.add(28);
	   it =lst2.iterator();
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	
	
	
}
}
