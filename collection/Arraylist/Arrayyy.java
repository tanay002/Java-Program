package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Company
{
	private int id;
	private String sname;
	
	public String toString()
	{
		return id+" "+sname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Company(int id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}
	
}
public class Arrayyy {
public static void main(String[] args) {
	Company c=new Company(102, "tanay");
	Company c1=new Company(12, "tanny");
	Company c2=new Company(32, "tannnay");
	
	Studdent s=new Studdent(200, "rajat");
	Studdent s1=new Studdent(20, "raj");
	Studdent s2=new Studdent(100, "raka");
	
	List ls=new ArrayList();
	ls.add(c);
	ls.add(c1);
	ls.add(c2);
	
	List ls2=new ArrayList();
	ls2.add(s);
	ls2.add(s1);
	ls2.add(s2);
	
	List lst=new ArrayList();
	lst.addAll(ls);
	lst.addAll(ls2);
	 Iterator it= ls.iterator();
	 Iterator it2= ls2.iterator();
	while(it.hasNext())
	{       Company ck=  (Company) it.next();
		System.out.println(ck.getId());
/*	while(it2.hasNext())
	{
		System.out.println(it2.next());
		break;
	}*/
	}
}
}
