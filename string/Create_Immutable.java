package com.string;

public class Create_Immutable
{
	public static void main(String[] args) 
	{
    OpenDox op=new OpenDox("Tanay",53);
    OpenDox op1=new OpenDox("Vinay",58);
    System.out.println(op.getName()+" "+op.getRollno());
    System.out.println(op1.getName()+" "+op1.getRollno());
	}
}

final class OpenDox
{
	private final String name;
	private final int rollno;
	
	public OpenDox(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
	
	public String getName() 
	{
		return name;
	}

	public int getRollno() {
		return rollno;
	}

}
//we have created an immutable class,we create one object and set value.now we can't change
//value in created object it means our class is immutable