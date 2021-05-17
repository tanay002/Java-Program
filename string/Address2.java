package com.string;

public class Address2 implements Cloneable
{
	public String city;

	public String getCity() {
		return city;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public void setCity(String city)
	{
		this.city=city;

	}

	public String toString()
	{
		return city;
	}
	Address2(String city)
	{
		this.city=city;	
	}
}
