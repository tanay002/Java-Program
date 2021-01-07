package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain 
{
public static void main(String[] args) 
{
Address address=new Address("Sky Residency");	
Address address1=new Address("Vishnupuri");	
ArrayList a=new ArrayList();
a.add(address);
a.add(address1);

Student s=new Student(101, "Tanay", a);

ArrayList<Address> sk=s.getAns();
//List ls=Collections.unmodifiableList(sk);
sk.add(new Address("Bholaram")); //again schenario fail ....data list me insert ho raha hai...but our class is immutable..we have to avoid this
//so we have to use clone method when we fetch data from getter method

ArrayList<Address> sk1=s.getAns();

System.out.println(sk1);
}
}
