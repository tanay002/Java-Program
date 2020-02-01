package com.AbstrationAndInterface;

abstract class Phone
{
	public abstract void features(); 
}

class Nokia extends Phone
{
	public void features()
	{
		System.out.println("526 Snapdragon" +"\n"+"2GB RAM 64 GB ROM");
	}
}
public class AbstractExample7
{
	public static void main(String[] args) 
	{
		Nokia n=new Nokia();
		n.features();
		Phone p=new Nokia();
		n.features();
	}
}
