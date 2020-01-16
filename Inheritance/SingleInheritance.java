package com.inheritance;
//In inheritance concept..we can say that 
//Jiska reference uski method
public class SingleInheritance
{
	
	public static void main(String[] args) 
	{
    B b=new B();
    b.demo2();
    A a=new A();
    a.demo1();
     //a.demo2(); demo is undefined for type A
    A a1=new B();
    a1.demo1();

      //(small class=B)   (Higher class=A)
  //  B b1=new A();  CTE (Explaination down)
    
    /*  ->Cannot Convert from A to B  (CTE)       
        ->'A' parent class hai aur 'B child class hai.hum child class ka reference lekar 
        parent class ko call nhi kar sakte (means parent class ka obj nhi bana)
       ->par hum parent class ka reference lekar child class ko call kar sakte hai(means obj 
       bana sakte hai)
       
       */
    
	}
}
//If we create class as final so,child class can't inherit parent class.So it can't read and
//write content of parent class
class A
{
	public void demo1()
	{
		System.out.println("Methods of A");
	}
}


class B extends A
{
	public void demo2()
	{
		System.out.println("Methods of B");
	}

}
