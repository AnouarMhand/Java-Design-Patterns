package com.structural.decorator;

public class Vanille extends AbstractDecorator {

	public Vanille(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " au vanille";
	}

	@Override
	public double cout() {

		return 0.8 + boisson.cout();
	}

}
