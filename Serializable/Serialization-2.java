package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable
{ 
	static int id;
	String name;
	transient String city;

	public Serialization(int id,String name,String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public static void main(String[] args) throws IOException
	{
		Serialization s=new Serialization(53,"Tanay Saxena","Indore");
	FileOutputStream fos=new FileOutputStream("abc.txt");
	  ObjectOutputStream oos=new ObjectOutputStream(fos);
	  oos.writeObject(s);
	  oos.close();
	  fos.close();
	}
}
