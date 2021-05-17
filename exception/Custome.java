package com.exception;

import java.util.Scanner;

public class Custome
{

	static void checkAge(int age) throws MyException
	{
		if(age>18)
		{
			System.out.println("Eligible to Vote");
		}
		else
		{
			throw new MyException("Can't Vote");
		}
	}

public static void main(String[] args) throws MyException 
{
	
    checkAge(17);	
}



}

class MyException extends Exception
{
	public MyException(String msg) 
	{
		System.out.println(msg);
	}
}
