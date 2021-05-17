package com.object;
class Alpha
{
	int id;
	String name;

	Alpha(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
     public int hashCode()
     {
    	 return (id+" "+name).hashCode();
     }
	public String toString()
	{
		return id+" "+name;	
	}
	
	public boolean equals(Object o)
	{
		if(this.hashCode()==o.hashCode())
			return true;
		else
			return false;
	}
}
public class Address 
{
	public static void main(String[] args)
	{
		String s=new String("This is java");
		Alpha a=new Alpha(101,"Byte");
		Alpha a1=new Alpha(101,"Byte");
		//System.out.println(a.hashCode());
		//System.out.println(a1.hashCode());
	//	System.out.println(a.hashCode()==a1.hashCode());
		System.out.println(a.equals(a1));
	}
}
