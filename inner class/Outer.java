package com.inner.classes;
//Case 1- Accessing inner class from static area of outer class
public class Outer
{
	private int rollNo=10;
	public String eName="Tanay";
	int id=7;
	static String cName="bhopal";

	class Inner
	{
      public void demo()
      {
    	  System.out.println(rollNo);
      }
/*      public static void main(String[] args) 
         {
 
  //the method cannot be declared static,
//static method can only be declared in static or top level type
		
	}
	*/
     
	}
	
	public static void main(String[] args) {
		Outer o=new Outer();
		Outer.Inner oi=o.new Inner();
	}
}
