package com.final_static;

/*final */class SuperFinal  //case 3 we cannot extends the class if we use final
{
	/*final */public void demo()                 //case2
	{
		System.out.println("cool");
	}

}

public class Final1 extends SuperFinal  //case 3
{
	/*final*/ int i=20; //Case 1

	public void demo()                            //case2  cannot override the final method from SuperFinal
	{
		System.out.println("cool2");
	}

	public static void main(String[] args) 
	{
		Final1 f=new Final1();
		f.i=30; //case 1  //We cannot change the value of final variable
	}
}
