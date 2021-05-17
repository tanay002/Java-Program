package com.practice.objectclass;

//toSTring
//hashCode
//equals
//finalize
//clone
//wait -3
//notify
//notifyALl

//pkgname.classname@hexdecimehashocde
public class ObjectClass1 
{
	private String sName;
	private int rollno;

	ObjectClass1(String sName,int rollno)
	{
		this.sName=sName;
		this.rollno=rollno;
	}
	
public String toString()
	{
	return rollno+" "+sName;
	}
	
public int hashCode()
{
	return (rollno+" "+sName).hashCode();
}

public boolean equals(Object o)
{
if(this.hashCode()==o.hashCode())
{
	return true;
}
else
	return false;
}

	public static void main(String[] args) 
	{
    ObjectClass1 s=new ObjectClass1("Bytecoder", 1234);
    System.out.println(s.hashCode());
    ObjectClass1 s1=new ObjectClass1("Bytecoder", 1234);
    System.out.println(s1.hashCode());
    
    System.out.println(s.equals(s1));
    		
	}
}
