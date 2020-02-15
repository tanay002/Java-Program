package com.basics.startup;

public class EscapeCharacter 
{
	public static void main(String[] args)
	{
          /*    \n        New Line      
           *    \t        Horizontal tab
           *     \r       carriage return
           *     \b       backspace character
           *     \f       form feed
           *     \'       Single quote
           *     \"       Double quote
           *      \\      Back slash
           */
		
		System.out.println("This is\' symbol");
		System.out.println("This is\"wao\" symbol");
		System.out.println("This is \n symbol");
		System.out.println("This is\t symbol");
		System.out.println("This is \r symbol");
		System.out.println("This is\b symbol");
		
	//	System.out.println("This is\character");//invalid escaoe sequence
		System.out.println("This is\\character");
	}
}
