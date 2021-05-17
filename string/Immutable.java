package com.Stringg;
class Question
{
	private final int no;
	private final Answer ans;
	public Question(int no,Answer ans) throws CloneNotSupportedException
	{
		this.no=no;
		this.ans=(Answer)ans.clone();
	}

	public String toString()
	{
		return no+" "+ans;

	}
}

class Answer implements Cloneable
{
	String ansName;
	public Answer(String ansName)
	{
		this.ansName=ansName;	
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public String toString()
	{
		return ansName;

	}
}
public class Immutable 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Answer a=new Answer("OOps");
		Question q=new Question(1, a);
		System.out.println(q);
		a.ansName="Secure";
		System.out.println(q);
	}
}
