package com.iterate.collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Alpha3 implements Serializable
{
	private int id;
	private String name;
	private Delta3 del;

	public Delta3 getDel() {
		return del;
	}
	public void setDel(Delta3 del) {
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
class Delta3
{
	private String city;

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
public class SerializationChildTask3
{

	public static void main(String[] args) throws IOException 
	{
		Alpha3 a=new Alpha3();
		a.setId(1);
		a.setName("Raka");
		Delta3 d=new Delta3();
		d.setCity("Bhopal");
		
		a.setDel(d);
		FileOutputStream fos=new FileOutputStream("try.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//Exception in thread "main" java.io.NotSerializableException: com.iterate.collection.Alpha
		oos.writeObject(a);


	}
}
