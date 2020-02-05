package com.objectclass;

public class HashCodeLast
{
  int id;
String name;
 public HashCodeLast(int id,String name) 
 {
	this.id=id;
	this.name=name;
}
 public int hashCode()
 {
	 String k="id="+id+" name= "+name;
	 int g=k.hashCode();
	 return g;
 }
 
 public boolean equals(Object o)
 {
	HashCodeLast h1=(HashCodeLast) o;
	if(this.hashCode()==h1.hashCode())
	{
		return true;
	}
	else 
	{
		return false;
	}
	 
 }
	public static void main(String[] args) 
	{
    HashCodeLast hcl=new HashCodeLast(101,"Tanay");
    HashCodeLast hc2=new HashCodeLast(101,"Tanay");
    int k=hcl.hashCode();
    int k1=hc2.hashCode();
    Boolean b=hcl.equals(hc2);
    System.out.println(k+" "+k1);
  System.out.println(b);
	}
}
