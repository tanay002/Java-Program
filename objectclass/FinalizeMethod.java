package com.objectclass;

public class FinalizeMethod 
{
	public static void main(String []args)
	{
		FinalizeMethod obj=new FinalizeMethod();
		System.out.println(obj.hashCode());
		obj=null;
		System.gc();
		System.out.println("end of gc");
	}

	protected void finalize()
	{
		System.out.println("Finalize method is called");	
	}
}
