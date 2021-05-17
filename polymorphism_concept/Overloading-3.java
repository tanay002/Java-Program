package polymorphism;

public class Overloading 
{ 
	/*
	public void demo(int i,int j)
	{
		System.out.println("demo1");
	}
	*/
	
	public void demo(int i,long j)
	{
		System.out.println("demo2");
	}

	public void demo(long i,int j)
	{
		System.out.println("demo9");
	}
	
	public static void main(String[] args) 
	{
            Overloading o=new Overloading();
          //  o.demo(10, 20); //the method demo is ambigious for the type class Name
            o.demo(10,20l);
	}
}
