package com.task;

public class MyString1 
{
	public static void main(String[] args) {
		String s="My name is tanay";
		String [] k=s.split(" ");
		String revWord="";
		for(int i=0;i<k.length;i++)
		{ 
			String word=k[i];

			for(int j=word.length()-1;j>=0;j--)
			{
				revWord=revWord+word.charAt(j);
			}
			revWord=revWord+" ";
		}
		System.out.println(revWord);
	}
}
