package com.behavioral.chainofresponsibility;

import java.util.Scanner;

public class ATMDispenseChain {
	private DispenseChain c1;

	ATMDispenseChain() {
		this.c1 = new USD100Dispenser();
		DispenseChain c2 = new USD50Dispenser();
		DispenseChain c3 = new USD20Dispenser();
		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 20 != 0) {
				System.out.println("Amount should be in multiple of 20s.");
				return;
			}
			// process the request
			atmDispenser.c1.dispense(new Currency(amount));
		}
	}

}
