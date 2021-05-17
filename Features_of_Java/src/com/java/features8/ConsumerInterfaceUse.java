package com.features8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
class Alpha implements Consumer<Integer>                 //implementing Consumer Interface
{

	public void accept(Integer t) 
	{
	System.out.println(t);	
		
	}
	
}*/
public class ConsumerInterfaceUse 
{
	public static void main(String[] args)
	{
              List<Integer>list=new ArrayList<Integer>();
              list.add(10);
              list.add(20);
              list.add(30);
              
   //           Consumer<Integer> c=new Alpha();
     //         list.forEach(c);
              
              
              Consumer<Integer> i=new Consumer<Integer>()  //Annoymous class
              {
				
				public void accept(Integer t)
				{
				System.out.println(t);
					
				}
			};
	             list.forEach(i);
	}
}
