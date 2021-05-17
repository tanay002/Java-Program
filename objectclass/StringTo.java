package com.objectclass;

public class StringTo 
{
	int sId;
	String sName;
	StringTo(int sId,String sName)
	{
		this.sId=sId;
		this.sName=sName;
	}
	public String toString()
	{
		return sId+" "+sName;
	}
	
//	public int hashCode()
//	{
//		return (sId+" "+sName).hashCode();
//	}
	
	public boolean equals(Object o)
	{
		
		if(this.hashCode()==o.hashCode())
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) 
	{
    StringTo s=new StringTo(200, "Bhopal");
    StringTo s1=new StringTo(200, "Bhopal");
    
    //System.out.println(s.hashCode());
    //System.out.println(s1.hashCode());
    
    System.out.println(s.equals(s1));
  //  System.out.println(s);
	}
}
