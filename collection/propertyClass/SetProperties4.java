package com.propertyClass;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class SetProperties4
{
	public static void main(String[] args) throws IOException
	{
		Properties ps=new Properties();
		ps.setProperty("Username","tanay@bytecoder.in");
		ps.setProperty("Password","12345");
            
		ps.store(new FileWriter("bytecoder.properties"),"Username and passwords of bytecoder");
		System.out.println("Done......!");

	}
}
