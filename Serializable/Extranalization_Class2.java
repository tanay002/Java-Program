package com.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Extranalization_Class2
{	
	public static void main(String[] args) throws FileNotFoundException,IOException, ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream("file2.txt");
	     ObjectInputStream ois=new ObjectInputStream(fis);
	   Dealers d1=(Dealers)ois.readObject();
	   System.out.println(d1.toString());  
  }
}
