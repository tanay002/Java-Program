package com.iterate.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadContent
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Enter file name without extension");
		Scanner sc=new Scanner(System.in);
		String filename=sc.nextLine()+".txt";


		File file = new File(filename); 
		BufferedReader br = new BufferedReader(new FileReader(file)); 

		String st; 
		while ((st = br.readLine()) != null) 
			System.out.println(st); 
	} 
} 


