package com.features.sub;

public interface Employee {

	default void demo()     //bydefault public abstract me break this rule with default
	{
		System.out.println("Hello");
	}
	 void task();
	 
	 public static void taskAlpha()
	 {
		 System.out.println("Static Use");
	 }
}
