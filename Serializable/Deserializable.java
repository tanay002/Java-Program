package com.Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializable
{
	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException
	{
      FileInputStream fis=new FileInputStream("file.txt");
      ObjectInputStream ois=new ObjectInputStream(fis);
      Employee e=(Employee) ois.readObject();
		System.out.println(e.empid+" "+e.empmobno+" "+e.empname);
	}
}
