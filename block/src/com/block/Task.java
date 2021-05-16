package com.block;
class B
{
	
static 
{
	Task t=new Task();
	t.demo();
System.out.println("OKKKKK");	
}

}

class A extends B
{
	static int alpha;
static
{
	alpha=20;
System.out.println("Bye");	
}

static
{
System.out.println("ok");	
}


}
public class Task extends A
{
	static int a;
static
{
	a=30;
System.out.println("Hello");
}

void demo()
{
System.out.println("Hello-2");	
}

static 
{
System.out.println("Thankyou");	
}


static 
{
System.out.println("Hiii");	
}

public static void main(String[] args)
{
	System.out.println(A.alpha);
	System.out.println(Task.a);
	System.out.println("Demo");
}
}
