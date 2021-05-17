package com.practice.object;
//Clone Method Part 2-Immutable Concept
final class Student 
{
	private final String name;
	private final Email email;

	public Student(String name,Email email) throws CloneNotSupportedException {
		this.name=name;
		this.email=(Email)email.clone();
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + "]";
	}


}

class Email implements Cloneable
{
	String email;
	Email(String email)
	{
		this.email=email;
	}
	
	public String toString()
	{
		return email;	
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class ObjectTaskClone3
{ 
	
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Email e=new Email("tanay.saxena002@gmail.com");
		Student s=new Student("Tanay",e);
		System.out.println(s);
		e.email="tanayspace@gmail.com";
		System.out.println(s);
	}
}
