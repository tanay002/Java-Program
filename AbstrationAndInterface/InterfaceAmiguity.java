package com.p;
interface Alpha
{
	int i=10;
}
interface Beta extends Alpha
{
	int i=20;	
}
public class InterfaceAmiguity implements Beta
{
	public static void main(String[] args) 
	{
    Beta b= new InterfaceAmiguity();
    Alpha a= new InterfaceAmiguity();
    System.out.println(b.i);
    System.out.println(a.i);
    
    System.out.println(new InterfaceAmiguity().i);
	}
}
