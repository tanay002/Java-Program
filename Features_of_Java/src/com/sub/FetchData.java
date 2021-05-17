package com.features.sub;

public class FetchData implements Employee,Student
{

	public void task() {
		System.out.println("wao");
	}

	public void demo() 
	{
		System.out.println("Child once");
	}

	public static void main(String[] args) {

		FetchData f=new FetchData();
                f.demo();
                
                
		Employee.taskAlpha();
		Student.taskAlpha();

	}
}
