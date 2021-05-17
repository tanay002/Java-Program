package com.task;
class Beta
{
int i=10;

}
public class Alpha extends Beta
{
int i=20;

public static void main(String[] args) {
	Beta a=new Alpha();
	System.out.println(a.i);
}
}
