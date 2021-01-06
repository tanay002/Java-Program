package com.java.features8.stringjoiner;

import java.util.StringJoiner;

public class StringJoiner1 
{
public static void main(String[] args)
{
	StringJoiner j=new StringJoiner(",");
	j.add("Tanay");
	j.add("Raxx");
	j.add("kari");
	System.out.println(j);
}
}
