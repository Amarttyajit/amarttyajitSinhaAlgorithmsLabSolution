package com.lab2.practice1;
import java.util.Scanner;
public class PayMoney {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int size= sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the number of targets");
		int t= sc.nextInt();
		for(int k=0; k<t; k++)
		{
		System.out.println("Enter the elements of array:");
		for(int i=0; i< size; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Target Value");
		int target= sc.nextInt();
		int sum=0,j=0;
		while(sum<target && j<size)
		{
		sum=sum+ arr[j];
			j++;
		
		
		}
		
		if(sum< target)
			System.out.println("Target not achieved");
		else
		System.out.println("Target achieve after "+ j +" transactions");

	}
	}

}


