package com.AbtsrationAndInterface;

/*final */abstract class Demo  //class can be abstract or final not both
{
	abstract void demoMeth();
//	/*final*/ abstract void demo2(); //demo can only set a visibility modifier,one of public or protected
	
	 static void demo2(){
		 System.out.println("demo2");
	 }
	 
 final void demo3(){
		 System.out.println("demo3");
	 }
 
 void demo4(){
	 System.out.println("demo4");
 }
	 //Agar hum kisi method ko abstract nhi bana rahe hai to uska implementation dena zarroori hai in existing abstract class
	 //we can create final method and static method without abstract keyword in abstract class..but it can;t be override 
	
}
class Memo extends Demo
{
	public void demoMeth()
	{
		System.out.println("Hello");
	}
	
	/*public void demo2()          Can't override method because of final and static
	{
		System.out.println("Hey");
	}
	
	public void demo3()
	{
		System.out.println("Hey");
	}
	*/
	 void demo4(){
		 System.out.println("demo4");
	 }
}

public class AbstractClass3 
{
	public static void main(String[] args) 
	{
		
	
  Demo m=new Memo();
  m.demoMeth();
  
	}
}
