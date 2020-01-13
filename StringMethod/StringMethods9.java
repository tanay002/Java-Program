package com.StringMethod;

public class StringMethods9
{
	public static void main(String[] args)
	{ 
		//toCharArray
		String s="Now CONVERTING THE JAVA teXt in ArrAy";
		char g[]=s.toCharArray();
		for(int i=0;i<g.length;i++)
		{
			System.out.print(g[i]);	
		}

		//toLowerCase and toUpperCase method
		String s1=s.toLowerCase();
		String s2=s.toUpperCase();
		System.out.println("\n"+s1+"\n"+s2);

		//trim methods
		String k="  	java is awsome  ";
		k=k.trim();
		System.out.println(k);
		
		//valueOf
		
		int value=30;  
		String v1=String.valueOf(value);  
		System.out.println(v1+10);
		
		boolean bol = true;      
        String sk = String.valueOf(bol);    
        System.out.println(sk);  
	
        char ch1 = 'A';    
        String c1 = String.valueOf(ch1);    
        System.out.println(c1);
        
        float f  = 10.05f;    
        double d = 10.02;  
        String g1 = String.valueOf(f);    
        String g2 = String.valueOf(d);  
        System.out.println(g1);  
        System.out.println(g2);  
        
        byte b2=11;    
        short sh = 12;  
        long l = 14L;   
        char chr[]={'j','a','v','a'}; 
        
        String n1=String.valueOf(b2); 
        String n2=String.valueOf(sh); 
        String n3=String.valueOf(l); 
        String n4=String.valueOf(chr); 
        
        System.out.println(n1+"\n"+n2+"\n"+n3+"\n"+n4);
	}
}
