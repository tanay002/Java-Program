package com.iterate.collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Alpha
{
	private int id;
	private String name;
	private Delta del;

	public Delta getDel() {
		return del;
	}
	public void setDel(Delta del) {
		this.del = del;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Delta implements Serializable
{
	private String city;

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
public class SerializationChildTask
{

	public static void main(String[] args) throws IOException 
	{
		Alpha a=new Alpha();
		a.setId(1);
		a.setName("Raka");
		Delta d=new Delta();
		d.setCity("Bhopal");
		
		a.setDel(d);
		FileOutputStream fos=new FileOutputStream("try.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//Exception in thread "main" java.io.NotSerializableException: com.iterate.collection.Alpha
		oos.writeObject(a);


	}
}
