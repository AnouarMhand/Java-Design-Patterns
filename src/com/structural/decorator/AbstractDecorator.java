package com.structural.decorator;

public abstract class AbstractDecorator extends Boisson {

	protected Boisson boisson;

	public AbstractDecorator(Boisson boisson) {
		super();
		this.boisson = boisson;
	}

	public abstract String getDescription();
}
