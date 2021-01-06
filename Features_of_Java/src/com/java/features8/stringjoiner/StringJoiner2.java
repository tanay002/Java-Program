package com.java.features8.stringjoiner;

import java.util.StringJoiner;

public class StringJoiner2 
{
public static void main(String[] args)
{
	StringJoiner j=new StringJoiner(",");
	j.add("Tanay");
	j.add("Raxx");
	j.add("kari");
	
	StringJoiner j1=new StringJoiner(":");
	j1.add("Vinay");
	j1.add("Anil");

	 j.merge(j1);
	System.out.println(j);
}
}
