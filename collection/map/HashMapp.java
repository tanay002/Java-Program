package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class Studdent
{
	int id;
	String sname;

	Studdent(int id,String sname)
	{
		this.id=id;
		this.sname=sname;
	}
	
	public String toString()
	{
		return id+" "+sname;
	}

	public int hashCode()
	{
		return (id+" "+sname).hashCode();
		
	}
	
	public boolean equals(Object o)
	{
		if(this.hashCode()==o.hashCode())
			return true;
		else
			return false;
	}
}
public class HashMapp 
{
	public static void main(String[] args) 
	{
		Studdent sp=new Studdent(101,"Abcde");
		Studdent s1=new Studdent(201,"Abcde");
		Studdent s2=new Studdent(301,"Abcde");
		Studdent s3=new Studdent(101,"Abcde");
		Map<Studdent, String> m=new HashMap<Studdent, String>();
		m.put(sp,"ok");
		m.put(s1, "abcd");
		m.put(s2,"xyz");
		m.put(s3,"qwe");
		Set s= m.entrySet();
		Iterator it=s.iterator();
                     
		while(it.hasNext())
		{
			Map.Entry<Integer,String> map=(Map.Entry<Integer,String>)it.next();
			System.out.print(map.getKey()+" ");
			System.out.println(map.getValue());
		}
	}
}
