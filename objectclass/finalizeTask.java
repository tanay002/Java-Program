package com.objectclass;

public class finalizeTask
{
	public static void main(String[] args) {
		
		finalizeTask f=new finalizeTask();
		f=null;
		System.gc();
		System.out.println("Hello");
		
 	//System.out.println(f);
		System.out.println("Hello2");

	}
}
