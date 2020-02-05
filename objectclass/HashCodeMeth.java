package com.objectclass;

public class HashCodeMeth
{
    int i;
	 String j;
	 
	 public HashCodeMeth(int i,String j)
	  {
		   this.i=i;
			this.j=j;
	}
	 public int hashCode()
	 {
		 int h=(i+" "+j).hashCode();
		 return h;
		 
	 }
	 
public static void main(String []args)
{
	HashCodeMeth h=new HashCodeMeth(1,"abc");
	HashCodeMeth h1=new HashCodeMeth(1,"abc");
	int k=h.hashCode();
	int k1=h1.hashCode();
	System.out.println(k);
	System.out.println(k1);
}
}
