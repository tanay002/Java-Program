package com.Stringg;

public class Reverse
{
public static void main(String[] args) {
	String p="Tanay";
	String temp="";
	int s=p.length();
	for(int i=p.length()-1;i>=0;i--)
	{
		temp=temp+""+p.charAt(i);
	}
	System.out.println(temp);
}
}
