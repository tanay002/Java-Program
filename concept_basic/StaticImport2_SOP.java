package com.basics.startup;
import static java.lang.System.out;
/*import static java.lang.Integer.MAX_VALUE;  explicit import*/
import static java.lang.Byte.*;
public class StaticImport2_SOP 
{
public static void main(String[] args) 
{
	out.println("Hello");
	System.out.println("Kya Baat Hai");
	System.out.println(MAX_VALUE); //MAX_VALUE is ambigious
	                    //Max_value exist in both Integer and Byte class so we have to explicitly static import one o package
}
}
