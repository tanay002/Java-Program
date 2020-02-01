package com.AbstrationAndInterface;

interface Movies
{
	public abstract void movieName();
}

interface Bollywood extends Movies
{
	public abstract void movieName2();
}

class Hollywood implements Movies
{
	public void movieName()
	{
		System.out.println("Marvels");
	}
}

public class Interface3 implements Bollywood
{
	public void movieName2()
	{
		System.out.println("Dishoom");
	}
	
	public void movieName()
	{
		System.out.println("X-Men");	
	}
	public static void main(String[] args) 
	{
	   Bollywood  b=new Interface3();   //Jiska object uski method
	   b.movieName();
	   b.movieName2();
	   
	  Movies m1=new Interface3();
	  m1.movieName();
	  
	              Movies e =new Hollywood();
	              e.movieName();
	}

	
}
