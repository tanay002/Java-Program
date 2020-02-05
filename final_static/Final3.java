package com.final_static;

public class Final3
{
	final int k;  //blank final variable,we can initilized blank final variable only inside constructor
	
	public Final3(int k) 
	{
		this.k=k;
	}
	
	public void setK(int k)
	{
		//this.k=k;            //we cannot initilized value of Final variable using getter method
	}
	public static void main(String[] args) 
	{
		Final3 f=new Final3(10);
		System.out.println(f.k);
	}
}
