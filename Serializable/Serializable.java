package com.Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Employee implements java.io.Serializable
{
//If we does not implements Serializable interface then it will throws "java.io.NotSerializableException"

	int empid;
	transient String empname; //agar hum transient ko use karenge to wo object ke variable ko serialize nhi karega(means bytestream me 
	                               // convert nhi karega  )
	String empmobno;

	Employee(int empid,String empname,String empmobno)
	{
		this.empid=empid;
		this.empname=empname;
		this.empmobno=empmobno;
	}

}
public class Serializable
{

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		Employee e=new Employee(1023,"Tanay Saxena","8878056735");
		FileOutputStream fos=new FileOutputStream("file.txt");
	      ObjectOutputStream oos=new ObjectOutputStream(fos);
	      oos.writeObject(e);
	}
}