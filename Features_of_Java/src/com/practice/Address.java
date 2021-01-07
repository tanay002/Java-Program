package com.practice;

public class Address implements Cloneable
{
	private String address;

	public String getAddress() 
	{
		return address;
	}
   
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public Address(String address)
	{
		this.address=address;	
	}
	
	public String toString()
	{
		return address;
		
	}
}
