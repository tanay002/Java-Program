package com.inheritance;
//In inheritance concept..we can say that 
//Jiska reference uski method
class GrandParent
{
	public void demo1()
	{
		System.out.println("Methods of GrandParent");
	}
}


class Parent extends GrandParent
{
	public void demo2()
	{
		System.out.println("Methods of Parent");
	}

}

class Child extends Parent
{
	public void demo3()
	{
		System.out.println("Methods of child");
	}

}
public class MultiLevelInheritance
{

	public static void main(String[] args) 
	{
		/*Child c=new GrandParent();  Can't create reference of child class and obj of parent
		Child p=new Parent();              class  (small class=Child,Higher class=parent)
		Parent k=new GrandParent(); */
		
		Child c=new Child();
		c.demo1();
		c.demo2();
		c.demo3();
		Parent p=new Parent();
		p.demo2();
		p.demo2();
		
		GrandParent g=new GrandParent();
		g.demo1();
	}
}