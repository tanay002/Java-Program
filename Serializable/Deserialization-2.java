package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization 
{
public static void main(String[] args) throws IOException, ClassNotFoundException {
	FileInputStream fis=new FileInputStream("abc.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Serialization s=(Serialization) ois.readObject();
	System.out.println(s.id+" "+s.name+" "+s.city);
}
}
