package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//We can perform sorting with any primtive datatype but the condition is data must be homogeneous...
//means if we are taking int type data ..then all data must be of integer type....

public class Sorting1 
{ 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

        ArrayList a=new ArrayList();
		//Sorting in integer type data
        
        /*
		 * a.add(10);
		 *  a.add(12);          [5,10,12]
		 *   a.add(5);
		 *    Collections.sort(a);   
		 *    System.out.println(a);
		 *     Collections is a utility class and it has no of methods...so sort is a method of Collections class
		 *                               // java.util.Collections;
		 */
        
        //Sorting
      /*  a.add("tanay");
        a.add("anayy");         [anay,nayy,tanay]
        a.add("nayy");
        Collections.sort(a);        
        System.out.println(a);     */
        
        a.add('c');
        a.add('s');
        a.add('a');
        Collections.sort(a);
        System.out.println(a);
	
	}
}