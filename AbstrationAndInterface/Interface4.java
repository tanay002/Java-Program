package com.AbstrationAndInterface;
//Mutiple Inheritance can be achieved by using inteface
interface Hollywoood
{
	public abstract void movieName();
	public abstract void webSeriesName();
}
//the implementation of same methods of both interface is overrided in child class...i.e child class has one methods for both the 
    //interface ..so there is no CTE in mutiple inheritance in interface
interface Bollywoood
{
	public abstract void movieName();
	public abstract void dramaName();
}

class Moviees implements Hollywoood,Bollywoood
{
	public void movieName()
	{
		System.out.println("Marvels");
	}
	
	public void webSeriesName()
	{
		System.out.println("TVF Tripling");
	}
	
	public void dramaName()
	{
		System.out.println("Indori Drama");
	}
}

public class Interface4 
{	
	public void movieName()
	{
		System.out.println("X-Men");	
	}
	public static void main(String[] args) 
	{
	   Bollywoood  b=new Moviees();   //Jiska object uski method
	   b.movieName();
	   b.dramaName();
	   
	  Hollywoood m1=new Moviees();
	  m1.movieName();
	  m1.webSeriesName();
	 
	}

	
}
