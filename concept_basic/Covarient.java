package com.pkg;
class Try
{
public Try demo()
{
return new Try();

}
}
public class Covarient extends Try
{
	public Covarient demo()
	{
	
		
	return new Covarient();
			
	}
	public static void main(String[] args) {
		Try t=new Covarient();
	
		System.out.println(t.demo());
	}
}
