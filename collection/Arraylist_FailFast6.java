package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

//Problem of FailFast in ArrayList,LinkedList ,Stack, vector ,HashSet
public class Arraylist_FailFast6 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(4);
		al.add(20);
		al.add(15);
		al.add(23);  //ArrayList me data 4 Hai
		                        
		Iterator it=al.iterator();  //Iterator calculates the mod count of an arraylist ,i.e it gets 4 
/*comment down line to execute properly->*/
	 al.add(34);//After adding another element in the array list ....the mod count of arraylist increased to 5
		                   //but the iterator has mod count (4)....so both mod count of ArrayList and Iterator doesn't match
	
		
		while(it.hasNext())         //so it give java.util.ConcurrentModificationException  while iteration
		{
			System.out.println(it.next());
		}

		Stack s=new Stack();
		s.push("11");
		s.push("2");
		Iterator en=s.iterator();
		/*comment down line to execute properly->*/
		s.push(6);
		while(en.hasNext())
		{
			System.out.println(en.next());
		}
	
	}
}
