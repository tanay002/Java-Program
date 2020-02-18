package com.propertyClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass1 
{
	public static void main(String[] args) throws IOException 
	{
    FileReader io=new FileReader("db.properties");
    Properties p=new Properties();
    p.load(io);
    
    String uname=p.getProperty("Username");
    String pass=p.getProperty("Password");
    System.out.println(uname);
    System.out.println(pass);
    
    io.close();
	}
}
