import java.util.Scanner;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.math.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class customer {
	String name;
	String email;
	double PhoneNum;

	public void CustomerMethod(){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter name of customer: ");
		String name = input.nextLine();
		System.out.print("Enter email of customer: ");
		String email = input.nextLine();
		System.out.print("Enter phone number of customer: ");
		double PhoneNum = input.nextDouble();


	}
}



