package com.behavioral.chainofresponsibility;

public class USD100Dispenser implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain chain) {
		this.chain = chain;

	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 100) {
			int num = cur.getAmount() / 100;
			int remainder = cur.getAmount() % 100;
			System.out.println("Dispensing " + num + " 100$ note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}

	}

}
