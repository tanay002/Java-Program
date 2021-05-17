package com.features8;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_forEachMethod
{
	public static void main(String[] args) 
	{
        List<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(6);
        
		/*
		 * for(Integer i:list) { System.out.println(i); }
		 * 
		 * for(int i=0;i<list.size();i++) { System.out.println(list.get(i)); }
		 */
        
        list.forEach(
        		i->
        		System.out.println(i)
        		);
	}
}
