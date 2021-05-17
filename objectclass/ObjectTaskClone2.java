package com.practice.object;
//Clone Method
public class ObjectTaskClone2 implements Cloneable
{ 
	private String name;

	public ObjectTaskClone2(String name) 
	{
		this.name=name;
	}
	public Object clone() throws CloneNotSupportedException 
	{
	//return super.clone();  //return new objec with same data..hashcode diff
	return this;  //return same object with same data..hashcode same
	}
	
	public String toString()
	{
		return name;
	}
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		ObjectTaskClone2 o=new ObjectTaskClone2("Tanay");
		System.out.println(o.hashCode()+" "+o);
		ObjectTaskClone2 o2=(ObjectTaskClone2) o.clone();
		System.out.println(o2.hashCode()+" "+o2);
	}
}
