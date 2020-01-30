package com.collection;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

public class Stack4 
{
	public static void main(String[] args)
	{
		int c;
		Stack s=new Stack();
		Scanner sc=new Scanner(System.in);
		int ch=1;
		do
		{
			System.out.println("Press-> 1:Push 2:Pop 3:Peek  4:Traverse 5:Exit \n");
			c=sc.nextInt();
			switch(c)
			{
			case 1: s.push(sc.next());
			break;
			case 2: s.pop();
			break;
			case 3: System.out.println(s.peek());
			break;
			case 4: 
				Enumeration e=s.elements();
				while(e.hasMoreElements())
				{
					System.out.println(e.nextElement());
				}
				System.out.println("");
				break;
			case 5: System.exit(0);
			break;
			default: System.out.println("Invalid Choice:");
			System.out.println("Do you want to continue Press 1 to Continue else 0 to exit");
			ch=sc.nextInt();
			}

		}while(ch==1);
	}
}

