package com.lab2.problem2;
import java.util.Scanner;
public class Money {
	public static void main (String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Size of currency denominations:");
		int size= s.nextInt();
		int denomination[]= new int[size];
		
		int i;
		System.out.println("Enter the currency denominations:");
		for( i=0; i< size; i++)
		{
			denomination[i] = s.nextInt();
		}
		System.out.println("Enter the amount you want to pay:");
		int amt= s.nextInt();
		Money bs= new Money();
		bs.sort(denomination);
		for(i=0; i<size; i++)
		{
			System.out.print(" " +denomination[i]+ " " );
			
	}
		System.out.println();
		bs.notesCountImplementation(denomination, amt);
		
		
			
	}
	
	public void sort(int denomination[])
	{ 
		int j;
	boolean flag=true;
	int temp;
	while(flag)
	{flag=false;
	for (j=0;j<denomination.length-1; j++)
	{
	if (denomination[j]<denomination[j+1])
	{
		temp=denomination[j];
		denomination[j]= denomination[j+1];
		denomination[j+1]= temp;
		flag= true;
	}
	}

	}
	}

	
	public void notesCountImplementation(int notes[], int amt)
	{ 
		int[] noteCounter= new int [notes.length];
		try {
			for (int i=0; i< notes.length; i++)
			{  if(amt >= notes[i]) {
				noteCounter[i] = amt/ notes[i];
				amt= amt- noteCounter[i]*notes[i];
			}
				
			}
			if(amt>0)
			{
				System.out.println("exact amoount cannout be given with the highest denomination");
			
			}
			else
			{
				System.out.println("your payment approach in order to give min no of notes will be  ");
				for(int i=0; i< notes.length; i++)
				{
					if (noteCounter[i]!= 0) {
						System.out.println(notes[i] + ":" + noteCounter[i]);
					}
				}
			}
		}
	 catch(ArithmeticException e)
		{
		 System.out.println(e+ "notes of denomination 0 is invalid");
		}
		
	}
}
















