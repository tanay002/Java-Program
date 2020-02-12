package com.bytecoder.batch;

public class Student 
{
	private String name;
	private int id;
	
	Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString()
	{
		return name+""+id;
	}
	
	public int hashCode()
	{
		return (name+" "+id).hashCode();
	}
	public boolean equals(Object o)
	{   
		System.out.println(this.hashCode());  //DownCasting is not necessary because of override rule
	 System.out.println(o.hashCode());
		if(this.hashCode()==o.hashCode())
			return true;
		else
			return false;
	}
public static void main(String[] args)
{
	Student s=new Student("Rax",102);
	Student s1=new Student("Rax",102);
	boolean b=s.equals(s1);
	System.out.println(b);
}
}
