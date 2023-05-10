package com.ASSG;

import java.util.*;
public class email{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

ArrayList<String> Email = new ArrayList<String>();

 Email.add("xyz@gmail.com");

Email.add("abc@gmail.com");

 Email.add("pqr@gmail.com");

Email.add("def@gmail.com");

Email.add("uvw@gmail.com");

System.out.println("Enter the email to search: ");

String searchEmail = sc.next();


boolean flag = false;

for(String In: Email) {

if(searchEmail.equalsIgnoreCase(In)) {
	
  System.out.println("Email is present in the list");

     flag = true;
}

else if(flag == false) 
{
  System.out.println ("Email is not present in the list");
  ]

        

    }

 

}
}