package com.java.features8.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachTry
{
	 public static void main(String[] args) {  
	        List<String> list = new ArrayList<String>();  
	        list.add("Football");  
	        list.add("Cricket");  
	        list.add("Chess");  
	        list.add("Hocky");    
	        list.forEach(ls -> System.out.println(ls));  
	        
	        list.forEach(System.out::println);
	        
	        list.stream().forEachOrdered(System.out::println);
	          
	    }  
}
