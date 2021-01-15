package com.iterate.collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
public class TakeMutipleLine 
{ 	
	static char ch;
	StringBuffer file;

	public TakeMutipleLine(StringBuffer file)
	{
		this.file=file;
	}

	public static void main(String[] args) throws IOException
	{	
		StringBuffer b=new StringBuffer("");	
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to insert Line y/n");
		ch=sc.nextLine().charAt(0);	
		int num=0;
		do
		{
			if(ch=='y'||ch=='Y')
			{
				System.out.println("Enter string");
				b=b.append(sc.nextLine()+" ");
				System.out.println("Do you want to insert Line y/n");
				ch=sc.nextLine().charAt(0);
			}
			else
				break;	
		}
		while(ch=='y'||ch=='Y');	
		System.out.println(b);
		PrintWriter writer = new PrintWriter("file.txt", "UTF-8");
		writer.print(b);
		writer.close();




	}

}

