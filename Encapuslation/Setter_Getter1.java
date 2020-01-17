package com.Encapuslation;

public class Setter_Getter1 
{
	public static void main(String[] args) 
	{
        Alpha a=new Alpha();
        a.setName("Tanay");
        a.setRollno(53);
        
        System.out.println("Student name is "+a.getName()+" and Rollno is "+a.getRollno());
	}
}

class Alpha
{
	private int rollno;
	private String name;

	public void setRollno(int rollno)
	{
		this.rollno=rollno;	 /*if we does not write "this(current calling object)" in statement then value 
		               of rollno will be set in the same variable,it means :-it will not set the global variable,it will set 
		                 local variable  */
		                
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public int getRollno()
	{
		return rollno;
	}
  
	public String getName()
	{
		return name;
	}
}