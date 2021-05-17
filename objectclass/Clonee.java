package com.objectclass;

public class Clonee implements Cloneable
{
	int id;
	String name;

	Clonee(int id,String name)
	{
		this.id=id;	
		this.name=name;
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public int hashCode()
	{
		return (id+" "+name).hashCode();
	}

	public boolean equals(Object o)
	{

		if(this.hashCode()==o.hashCode())
			return true;
		else
			return false;

	}
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		String s1="Tanay";
		String s2="Tanay";
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		Clonee c=new Clonee(20, "Pune");
		Clonee c1=(Clonee)c.clone();
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		//	Clonee c1=c;

		System.out.println(c.equals(c1));

	}

}
