package com.string;

public class StringTask2

{
public static void main(String[] args) 
{
String s="Java is awsome";

String [] a=s.split(" ");
String temp="";
temp=a[0];
a[0]=a[2];
a[2]=temp;

for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");	
}


}
}
