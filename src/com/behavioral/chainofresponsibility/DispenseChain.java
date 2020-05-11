package com.behavioral.chainofresponsibility;

public interface DispenseChain {
	 void setNextChain(DispenseChain chain);

	void dispense(Currency cur);
}
