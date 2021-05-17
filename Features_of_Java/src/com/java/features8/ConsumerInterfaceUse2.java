package com.features8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceUse2 
{
	public static void main(String[] args)
	{
              List<Integer>list=new ArrayList<Integer>();
              list.add(10);
              list.add(20);
              list.add(30);
            
	             list.forEach(i->System.out.println(i));
	}
}
