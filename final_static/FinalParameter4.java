package com.final_static;

public class FinalParameter4 
{
	
final void demo(final int id)
{
	/*id=id+2;*/  //A final local variable cannot be assigned,it must be blank or not final
}

public static void main(String[] args) 
{
FinalParameter4 f=new FinalParameter4();
f.demo(10);
}
}
