package com.task;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Externalization implements Externalizable 
{
	String name;
	String city;
	String password;
	public Externalization() 
	{
		
	}
	public Externalization(String name,String city,String password)
	{
		this.name=name;
		this.city=city;
		this.password=password;
	}

	public Externalization(String name,String city) {
		this.name=name;
		this.city=city;
	}
	public String toString()
	{
		return name+" "+city+" "+password;
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
	{
		city=(String) in.readObject();
		name=(String) in.readObject();
	}

	public void writeExternal(ObjectOutput out) throws IOException
	{
		out.writeObject(name);
		out.writeObject(city);
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Externalization e=new Externalization("Tanay`", "Indore", "tanay12334");
		FileOutputStream fos=new FileOutputStream("myFilee.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);


		FileInputStream fis=new FileInputStream("myFilee.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Externalization e1=(Externalization) ois.readObject();
		System.out.println(e1);


	}

}
