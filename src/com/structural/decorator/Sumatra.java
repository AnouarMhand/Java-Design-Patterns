package com.structural.decorator;

public class Sumatra extends Boisson {

	public Sumatra() {
		this.description = "Sumatra";
	}

	@Override
	public double cout() {

		return 8;
	}

}
