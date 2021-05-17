package com.practice.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Deserialization implements Serializable
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		//Serialization s=new Serialization("Bytecoder", 1234,"abcd@gmail.com");
		FileInputStream fos=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fos);
		SerializationCode ser=(SerializationCode)ois.readObject();
		System.out.println(ser);
	}
}

//Inner class
//String,Constructor,Block,Extrenalization
//Exception
//Collection
//thread