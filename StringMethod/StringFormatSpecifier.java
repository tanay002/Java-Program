package com.StringMethod;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Formatter;

public class StringFormatSpecifier 
{
	public static void main(String[] args) 
	{
		String k=null;
		String sp=String.format("Value is %a",12.0);     //hex value
		String s1=String.format("Value is %b",k);
		String s2=String.format("Value is %b","");       //return true and false
		String s3=String.format("Value is %c",'c');
		String s4=String.format("Value is %d",123);
		String s5=String.format("Value is %e",12.0);  //1.2000000
		String s6=String.format("Value is %f",154.0);
		String s7=String.format("Value is %g",1779.0);  //overall 6 digit
		String s8=String.format("Value is %h","tanay"); //hex string of value from hexcode() meth
		String s9=String.format("\n");           //change of line
		String s10=String.format("Value is %o",186);  //octal
		String s11=String.format("Value is %s","tanay_s");  //string
		String s12=String.format("Value is %x",152);  //hex 
		
		System.out.println(sp);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
        System.out.print(s9);
        System.out.println(s10);
        System.out.println(s11);
        System.out.println(s12);
        
	}
}
