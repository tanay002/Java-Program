package com.string.placementpractice;

import java.util.Scanner;

public class Program3 
{//count total existing word in sentence
	public static void main(String[] args) 
	{
		int count=0;
		int fromIndex=0;
		System.out.println("Enter String:- ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Search String:- ");
		String word=sc.next();

		//int size=str.length();

		while((fromIndex=str.indexOf(word,fromIndex))!=-1)
		{
			count++;
			fromIndex++;
		}
		System.out.println("Count is:- "+count);
	}
}
