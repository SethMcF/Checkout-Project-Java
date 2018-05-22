import java.lang.*;
import java.util.*;
import java.io.*;
import java.math.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



class Payment {
	int amount;
	String paymenttype;

	public void PaymentMethod(){


		System.out.print("Enter 1 for Credit Card, 2 for cash");

		Scanner input = new Scanner(System.in);
		   String paymenttype = input.nextLine();

		   if (paymenttype.equals("1")) {
	           paymenttype = "Credit Card";

	        if(paymenttype.equals("2")) {
	        	paymenttype = "Cash";

	        System.out.println("Payment = " + paymenttype);
	        System.out.println("Cost = ");

	    }
	}


	}
}


