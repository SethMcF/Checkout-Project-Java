/* Seth McFarland
 * Test setup for classes plus notes project
 */
import java.lang.*;
import java.util.*;
import java.io.*;
import java.math.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Final {
	public static void main(String[] args){

		customer customerObject = new  customer();
		customerObject.CustomerMethod();

		CheckOutDetails checkoutObject = new CheckOutDetails();
		checkoutObject.CheckOutDetailsMethod();

		Payment PaymentObject = new Payment();
		PaymentObject.PaymentMethod();



	}
}





