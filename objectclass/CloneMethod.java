package com.objectclass;

public class CloneMethod implements Cloneable
{
  String name;
  CloneMethod(String name) 
  {
	this.name=name;
 }
  public Object clone() throws CloneNotSupportedException
  {
	  return this;  //same  super.clone();
  }
  public String toString()
  {
	return name;
	  
  }
	public static void main(String[] args) 
	{
	try
	{
		CloneMethod c=new CloneMethod("Tanay");
		System.out.println("For C="+c);
	CloneMethod c1=(CloneMethod)c.clone();
	System.out.println("For C1="+c1);
	}
	catch(CloneNotSupportedException e)
	{
		e.printStackTrace();
	}
	}
}
