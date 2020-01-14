package com.StringMethod;

import java.util.Scanner;

//Insert an name and generate a gmail from it;
public class StringTask3 
{
	public static void main(String[] args) 
	{ String k="";
	System.out.println("Enter name-\n");
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	System.out.println("Pick Mail type \n1: gmail \n 2:yahoo \n 3:microsoft \n4: rediffmail\n");
	int c=sc.nextInt();

	switch(c)
	{
	case 1:k="gmail"; 
	break;
	case 2:k="yahoo"; 
	break;
	case 3:k="microsoft"; 
	break;
	case 4:k="rediffmail"; 
	break;
	default: System.out.println("Invalid Case");
	break;
	}
	name=name.concat("@").concat(k).concat(".".concat("com"));
System.out.println(name);
	}
}
