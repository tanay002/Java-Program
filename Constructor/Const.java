package com.bytecoder.storeprocedure;
//create a object n times based on users input and insert id from user n times and then print id every times from method
import java.util.Scanner;

public class Const
{ 
	private static int id;
	Const(int id)
	{
		this.id=id;
		demo();
	}
	public void demo()
	{
		System.out.println("Id is "+id);	
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		Const c []=new Const[k];

		for(int i=0;i<k;i++)
		{
			System.out.println("Enter id:- ");
			id=sc.nextInt();
			c[i]=new Const(id);
		}

	}
}
