package com.Serializable;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dealers implements Externalizable
{
	int id;
	String dealer_name;
	String company_name;
	String mobile;
	Dealers() 
	{
	}

	
	Dealers(int id,String dealer_name,String company_name,String mobile)
	{
	 this.id=id;
	 this.dealer_name=dealer_name;
	 this.company_name=company_name;
	 this.mobile=mobile;
	}
	
	public void writeExternal(ObjectOutput out) throws IOException  //ObjectOutput is an interface of java.io
	{
		out.writeInt(id);
		out.writeObject(dealer_name);
		out.writeObject(company_name);
	}
	public void readExternal(ObjectInput ios) throws IOException, ClassNotFoundException
	{
		id=ios.readInt();
		dealer_name=(String)ios.readObject();
		company_name=(String)ios.readObject();	
	}
}

public class Extranalization 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
     Dealers d=new Dealers(2017,"ritesh sir","bytecoder","8878056735");
     FileOutputStream fos=new FileOutputStream("file2.txt");
     ObjectOutputStream oos=new ObjectOutputStream(fos);
     oos.writeObject(d);
	}
}
