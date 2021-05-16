package com.iterate.collection;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TryDateOne
{ 
	static int num;
	public static void main(String[] args) 
	{
		int refDate=0;
		System.out.println("Enter number and check existing date from today date");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();
		now=now.plusDays(num);
		System.out.println(dtf.format(now));



	}
}
