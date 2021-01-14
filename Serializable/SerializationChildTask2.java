package com.iterate.collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//Serialize object of dependent class
class Alpha1 implements Serializable
{
	private int id;
	private String name;
	private Delta1 del;

	public Delta1 getDel() {
		return del;
	}
	public void setDel(Delta1 del) {
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
class Delta1 implements Serializable
{
	private String city;

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
public class SerializationChildTask2
{

	public static void main(String[] args) throws IOException 
	{
		Alpha1 a=new Alpha1();
		a.setId(1);
		a.setName("Raka");
		Delta1 d=new Delta1();
		d.setCity("Bhopal");
		
		a.setDel(d);
		FileOutputStream fos=new FileOutputStream("try.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//Exception in thread "main" java.io.NotSerializableException: com.iterate.collection.Alpha
		oos.writeObject(a);


	}
}
