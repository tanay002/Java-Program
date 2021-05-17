package com.practice.objectclass;

public class ObjectFinalize2
{
	String name;
public ObjectFinalize2(String name) 
{
	this.name=name;
}

public String toString()
{
	return name;
	}

protected void finalize() throws Throwable
{
	System.out.println("Working");
}
public static void main(String[] args) 
{
	ObjectFinalize2 obj=new ObjectFinalize2("Bytecoder");
	System.out.println(obj);
	obj=null;
	System.gc();
	System.out.println("Done...........!");

}
}
