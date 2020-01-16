package com.inheritance;
//In inheritance concept..we can say that 
//Jiska reference uski method
public class HybridInheritance
{

	public static void main(String[] args) 
	{
           Phone p=new Phone();
           p.phoneMethod();
           
           keypad k=new keypad();
           k.KeypadMethod();
           k.phoneMethod();
           
           Touchpad t=new Touchpad();
           t.phoneMethod();
           t.TouchpadMethod();
           
          FlexiblePhone f=new FlexiblePhone();
          f.FlexiblePhoneMethod();
          f.phoneMethod();
          
          MultiUsagePhone mup=new MultiUsagePhone();
          mup.MultiUsagePhoneMethod();
          mup.TouchpadMethod();
          mup.phoneMethod();
           
	}
}

class Phone
{
	public void phoneMethod()
	{
		System.out.println("Methods of phone");
	}
}


class keypad extends Phone
{
	public void KeypadMethod()
	{
		System.out.println("Methods of keypad phone");
	}

}

class Touchpad extends Phone
{
	public void TouchpadMethod()
	{
		System.out.println("Methods of Touchpad phone");
	}

}

class FlexiblePhone extends Phone
{
	public void FlexiblePhoneMethod()
	{
		System.out.println("Methods of Flexible Phone");
	}

}
class MultiUsagePhone extends Touchpad
{
	public void MultiUsagePhoneMethod()
	{
		System.out.println("Methods of MultiUsage PhoneMethod");

	}
}