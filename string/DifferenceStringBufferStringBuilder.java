package com.string;

public class DifferenceStringBufferStringBuilder 
{
	public static void main(String[] args) 
	{      
	        System.out.println("Hashcode test of StringBuffer:");  
	        StringBuffer sb=new StringBuffer("java");  
	        System.out.println(sb.hashCode());  
	        sb.append("tpoint");  
	        System.out.println(sb.hashCode());  	  	
	        
	        System.out.println("Hashcode test of StringBuilder:");  
	        StringBuffer sbk=new StringBuffer("java");  
	        System.out.println(sbk.hashCode());  
	        sbk.append("tpoint");  
	        System.out.println(sbk.hashCode());  
	        
	}
}
