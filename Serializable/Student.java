package com.task;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable
{
	static transient String name;
	int id;
	 private static final long serialVersionUID = 6529685098267757690L;
	Student(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	
	public String toString()
	{
		
		return name+" "+id;
	}
	
	public static void main(String[] args) throws IOException
	{
		Student s=new Student("abcd",123);
		FileOutputStream fos=new FileOutputStream("myFile.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
	System.out.println("Done");
	}
}
