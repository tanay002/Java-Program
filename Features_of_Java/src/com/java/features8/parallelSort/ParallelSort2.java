package com.java.features8.parallelSort;

import java.util.Arrays;

public class ParallelSort2 
{
	public static void main(String[] args) 
	{
             int [] a= {12,4,1,0,5,7,2,4};
                   Arrays.parallelSort(a,0,4);
                   
                   for(int ab:a)
                         System.out.print(ab+" ");           
	}
}
