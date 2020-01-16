package com.StringMethod;

public class StringMethods10
{
	public static void main(String[] args)
	{ 
		//startWith
		String t="java is awsome language-declared by Tanay Saxena";
		System.out.println(t.startsWith("j"));
		System.out.println(t.startsWith("jav"));
		System.out.println(t.startsWith("av"));

		System.out.println(t.startsWith("v",2));
		System.out.println(t.startsWith("va",2));
		System.out.println(t.startsWith("va",1));
		
		//substring
		
		String q="javalanguage is cool";
		System.out.println(q.substring(4));
		System.out.println(q.substring(4,10));
		System.out.println(q.substring(0));
		
		
	}
}
