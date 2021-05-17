package com.basics.startup;

public class Task_Identifier
{
	public static void main(String[] args) {

		int String=888;  //String and Runnable are not reserved words
		int Runnable=999;
		float k=12.0f;
		float o=12.00F;
		double d=123.45D;
		double q=12.45d;
		//float f=23.45d;  //cannot convert double to float
		double dok=123.90;
		double dh=067.9;
		//double d=0X123.456;  double d=0786; cte    
		//double dj=0XFace; valid 
		//double ddd=0786.0; valid
		//double ds=0XFace.0; invalid
		//double dhk=0777;
		//int x=10.0; invalid
		//	double kp=1.2e3; valid
		//	float qw=1.2e3;  //invalid treat double
		//float we=1.2e3F;  //valid

		boolean b=true;
		/*
		 * boolean b=0; boolean b=True; boolean b="true";  invalid
		 */
		char c='c';
		//	char cs=a; //a cannot be resolve to a variable...cannot find symbol
		//char cd='cd';
		//	char cdq="cd"; //cannot convert string to char
		char cp=0XFace;
		char ch=0777;
		char cf=65535;
		char co='\u0000';
		//char cg=65536; //cannot convert from int to char;

		char da='\u0061';
		char chg='\b';//  ( \b \t \n \f \r \" \' \\ )
		//char ch='\*';   '\m'  //illegal escape character
		System.out.println(chg);
		System.out.println(k);
        System.out.println("co_"+co+"_");
		System.out.println("this is\' jj");
		System.out.println(Runnable);
		System.out.println(String);
	}
}
