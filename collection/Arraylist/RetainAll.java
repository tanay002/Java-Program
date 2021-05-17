package com.collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Tryy 
{
	
public static void main(String[] args) 
{
List s=new ArrayList();
s.add(10);
s.add(20);
s.add(70);
s.add(30);

List s2=new ArrayList();
s2.add(30);
s2.add(70);


s.retainAll(s2);
System.out.println(s);
}
}
