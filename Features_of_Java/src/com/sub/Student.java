package com.features.sub;

public interface Student {

	
	default void demo()           //bydefault public
	{
		System.out.println("Hello");
	}
	
	 void task();
	 
	 public static void taskAlpha()
	 {
		 System.out.println("Static Use 2");
	 }
}
