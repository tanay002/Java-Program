package com.string;

public class StringBuilder_methods1
{
	public static void main(String[] args) 
	{
      StringBuilder sb=new StringBuilder("Hello i am ");
      System.out.println(sb);
      /* Append Methods*/
      sb.append("Tanay Saxena");
      System.out.println(sb);
     
      /* Insert Method */
      sb.insert(17,"kumar ");
      System.out.println(sb);
      
      /* Replace Method*/
      sb.replace(23,30,"Sharma");
      System.out.println(sb);
      
      /* Delete Method*/
      sb.delete(17,23);
      System.out.println(sb);
      
      /*Reverse*/
      sb.reverse();
      System.out.println(sb);
      
      /*Capactity*/
      
      System.out.println(sb.capacity());
	}
}
