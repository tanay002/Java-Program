package com.Encapuslation;

class Dataa
{
	private String name;
	private long mobno;
	private float salary;
	private boolean married;
	private int id;
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public long getMobno() 
	{
		return mobno;
	}
	public void setMobno(long mobno) 
	{
		this.mobno = mobno;
	}
	public float getSalary() 
	{
		return salary;
	}
	public void setSalary(float salary) 
	{
		this.salary = salary;
	}
	public boolean isMarried()
	{
		return married;
	}
	public void setMarried(boolean married)
	{
		this.married = married;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}


}
public class EmployeeData 
{
	public static void main(String[] args)
	{
		Dataa d=new Dataa();
		d.setId(153);
		d.setSalary(60000);
		d.setName("Tanay Saxena");
		d.setMarried(false);
		d.setMobno(99988871);
		System.out.println("Employee Data is:-\n"+d.getId()+"\n"+d.getMobno()+"\n"+d.getName());
		System.out.print(d.getSalary()+"\n"+d.isMarried());

	}
}
