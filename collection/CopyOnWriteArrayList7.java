package com.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList7 
{
	public static void main(String[] args) 
	{
     CopyOnWriteArrayList cal=new CopyOnWriteArrayList();
     cal.add(12);
     cal.add(15);
     cal.add(14);
     
     Iterator it=cal.iterator(); //While we iterate copyonwriteArraylist it display only 3 data (Because iterator has 3 mod count)
                                  //it will not display 
     cal.add(5);            //recent added data....and it will not throws exception of ConcurrentModifcationException
     cal.add(6);            //if we want to display recently added data we have to recheck the mod count of list by using iterator
     //it=cal.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
	}
}
