package com.ASSG;

import java.util.*;

public class Main 
{
	
public static void main(String[] args)
{

	String arr[] = {"necika1112@gmail.com", "rita234@gmail.com" , "raghav123@gmail.com" , "kriti231@gmail.com" , "krish9878@gmail.com"};

	Scanner scanner = new Scanner(System.in);

	String sh =" ";

	boolean t=true;

	do {

	 System.out.println("Enter the mail id");

	 String ch = " ";

	 ch = scanner.next();

	 for(int i = 0;i<arr.length; i++)

	 {

		 if(arr[i].equalsIgnoreCase(ch))

		 {	

			 System.out.println("Present in the array");

			 t=false;

			 break;
		 }
				
	}

	if(t) {
		System.out.println("Not present in array");
	}

	System.out.println("Do you want to continue : y.continue n.exit");

	sh = scanner.next();

	}
	while(sh.equalsIgnoreCase("Y"));

}
	

}
