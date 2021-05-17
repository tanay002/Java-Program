package com.practice.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationCode /* implements Serializable */
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static String email;
	private String sname;
	private int rollno;
	private transient String password;

	public SerializationCode(String sname,int rollno,String email,String password) 
	{
		this.sname=sname;
		this.rollno=rollno;
		this.email=email;
		this.password=password;
	}
	public String toString()
	{
		return sname+" "+rollno+" "+email+" "+password;
	}
	public static void main(String[] args) throws IOException
	{
		SerializationCode s=new SerializationCode("Bytecoder", 1234,"abcd@gmail.com","password");
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream ois=new ObjectOutputStream(fos);
		ois.writeObject(s);
	}
}
  