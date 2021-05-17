package com.string;

public class String1
{
	public static void main(String[] args)
	{
          String s="Java";
          String s1="Java";
          
          String s2="java";
      //    System.out.println(s==s1);
        //  System.out.println(s1==s2);
          
         // System.out.println(s.hashCode());
          //System.out.println(s1.hashCode());
          /////////////////////////////////
          
          String sk=new String("Java");
          String s4=new String("Java");
          System.out.println(sk==s4);
          System.out.println(s==s4);
          //////////////////////////////////////
          String sop="Lava";  //A=65  a=97
          String sop2="Nava";  //L=65+12=77   N=65+14=79          a=97                      77-79=-2
          System.out.println(sop.compareTo(sop2));  //Return no
          ////////////////////////////////////////////////////
          System.out.println(s1.equals(s2));
          System.out.println(s1.equals(s));
          System.out.println(s1.equals(s1));
	}
}
