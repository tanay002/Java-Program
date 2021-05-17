package com.practice.objectclass;

public class ObjectClone3 implements Cloneable
{
	private String sName;

	public ObjectClone3(String sName) {

		this.sName = sName;
	}

	public String toString()
	{
		return sName;	
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		//return this;
	}
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ObjectClone3 ob=new ObjectClone3("bytecode");
		//ObjectClone3 obb2=ob; //shallow cloning
		ObjectClone3 obb=(ObjectClone3)	ob.clone();//deep cloning
		System.out.println(ob+" "+obb);
		System.out.println(ob.hashCode()+" "+obb.hashCode());
	}
}
