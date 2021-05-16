package com.sorting;

public class BubbleSort
{
public static void main(String[] args) {
	int temp=0;
	int [] arr= {20,16,19,5,3,12};
	int flag;
	for(int i=0;i<arr.length;i++) 
	{      flag=0;
		for(int j=0;j<arr.length-1-i;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0)
		{
			break;
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
