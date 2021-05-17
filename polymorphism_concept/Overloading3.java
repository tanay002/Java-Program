package polymorphism;

public class Overloading3 
{
	
	/*
	 * public void demo(String s) { System.out.println("String "); }
	 */

	public void demo(Object o)
	{
		System.out.println("Object o");
	}

	public static void main(String[] args)
	{  
		Object oo=null;//=new Object();
      Overloading2 o=new Overloading2();
      o.demo("Tanay");
      o.demo(oo);
    //  o.demo(null); //ambigious
       
 
	}
}
