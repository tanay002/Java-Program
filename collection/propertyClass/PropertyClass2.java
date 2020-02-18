package com.propertyClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertyClass2 
{
	public static void main(String[] args) throws IOException 
	{
		System.out.println("Enter username and password");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String password=sc.next();
		FileReader io=new FileReader("db.properties");
		Properties p=new Properties();
		p.load(io);

		String uname=p.getProperty("Username");
		String pass=p.getProperty("Password");

		if(name.equals(uname)&&password.equals(pass))
		{
			System.out.println("Welcome "+uname);
		}
		else
			System.out.println("Invalid name or password");
		io.close();
	}
}
