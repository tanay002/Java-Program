package com.StringMethod;

import java.util.ArrayList;

public class String_Task3
{
public static void main(String[] args) {
	String name="Tanay";
	ArrayList<String> list=new ArrayList<>();
	list.add("Vinay");
	list.add("Tanay");
	list.add("Varun");
	list.add("Tarun");
	list.add("TaNaY");
	for(String str: list)
	{
		if(name.equals(str)||name.equalsIgnoreCase(str))
		{
			System.out.println("Tanay is present");
		}
	}
}
}
