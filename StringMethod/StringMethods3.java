package com.StringMethod;

public class StringMethods3 
{
	public static void main(String[] args) 
	{

		//getByte()
		String s1="Happy new year to all";
		byte[] b=s1.getBytes();

		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		int size=s1.length();
		
		//getChar()
	char []c=new char[size];
	s1.getChars(0,size,c,0);//getChar(int beginIndex,int endIndex,destination array,startIndex)


	}
}
