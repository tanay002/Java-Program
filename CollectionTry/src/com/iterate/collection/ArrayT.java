package com.iterate.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayT
{
	int value1=0;
	int value2=1;
	int temp;
	public void fib(int no,int count)
	{
		for(int i=no;i>=0;i--)
		{
			if(count==0)
			{
				System.out.print(value1+" ");
				count++;
			}
			else if(count==1)
			{
				System.out.print(value2+" ");
				count++;
			}
			else
			{
				
				temp=value1+value2;
				System.out.print(temp+" ");
				value1=value2;
				value2=temp;
				count++;
			}


		}

	}
	public static void main(String[] args)
	{
          ArrayT t=new ArrayT();
          t.fib(10,0);
	}
}