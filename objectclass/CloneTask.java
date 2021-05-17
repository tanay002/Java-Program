package com.objectclass;

public class CloneTask implements Cloneable
{
	int sId;
	String sName;

	public CloneTask(int sId,String sName)
	{
		this.sId=sId;
		this.sName=sName;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public int hashCode()
	{
		return (sId+""+sName).hashCode();
	}
	public String toString()
	{
		return sId+" "+sName;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneTask c=new CloneTask(100, "Indore");
		CloneTask c1=c;  //shallow cloning
		System.out.println(c1);
		System.out.println(c1.hashCode());
System.out.println(c.hashCode());
		
		CloneTask c2=(CloneTask)c.clone();
		
		System.out.println(c2.hashCode());
	System.out.println(c2);
	}
}
