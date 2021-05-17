package com.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Excep
{

	static void demo() throws FileNotFoundException
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("abcd.txt");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		demo();
	}
}
