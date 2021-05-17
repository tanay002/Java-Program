package com.string.placementpractice;

import java.util.Scanner;

public class Program4 
{//count all words in string
	public static void main(String[] args) 
	{
		System.out.println("Enter String:- ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.trim();
		String word=" ";
		String k[]=str.split(word);
		int count=k.length;
		System.out.println(count);
	}
}
