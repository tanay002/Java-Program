package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashh
{
public static void main(String[] args) {
	Map<Integer, String> m=new HashMap<Integer, String>();
	m.put(101, "Tanay");
m.put(11, "Ranjeet");

System.out.println(m);
Set sk=m.keySet();
System.out.println(sk);
Iterator it=sk.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
	}
}
}
