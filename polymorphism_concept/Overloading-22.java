package polymorphism;

public class Overloading2 
{
	
	public void demo(String s)
	{
		System.out.println("String ");
	}

	public void demo(StringBuffer s)
	{
		System.out.println("String Buffer");
	}

	public void demo(StringBuilder sb)
	{
		System.out.println("String Builder");
	}

	public static void main(String[] args)
	{
      Overloading2 o=new Overloading2();
      StringBuffer b=new StringBuffer("Hello");
    //  StringBuffer b1=new StringBuffer(null); can't pass null ->gives null pointer exception
       o.demo("Tanay Saxena");   //String wali method from 3 method
       o.demo(b);
     //  o.demo(b1);
     //  o.demo(null); ambigious
	//     StringBuffer b=new StringBuffer("Hello");
       //o.demo(b);
       
       StringBuffer bo=new StringBuffer(null);
       o.demo(bo);
       //o.demo(b);
	}
}
