package com.bytecoder.default1;

class OpenDox
{
	private static volatile OpenDox od=null;
	//all reads and writes will go straight to "main memory" except cache;
	//if we does not use volatile then it will check cache memory and print the old cache data..
	private OpenDox()
	{

	}
	public synchronized static OpenDox getObject()    
	//If we are using synchronized 
	//then only one process run at a time until that process complete its task
	{
		if(od==null)
		{
			od=new OpenDox();
		}
		return od;
	}
}
public class Singleton 
{
	public static void main(String[] args)
	{
		OpenDox od1= OpenDox.getObject();
		OpenDox od2=OpenDox.getObject();
		OpenDox od3=OpenDox.getObject();
		System.out.println();
		System.out.println(od1.hashCode());
		System.out.println(od2.hashCode());
		System.out.println(od3.hashCode());

	}
}

//variable will used the object of cache memory even if the object is deleted from the memory...
//and used old object...so we use volatile to used read and write object from memory if the 
//object is deleted then it will return null....