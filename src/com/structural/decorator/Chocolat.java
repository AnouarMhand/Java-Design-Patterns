package com.structural.decorator;

public class Chocolat extends AbstractDecorator {

	public Chocolat(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		return boisson.description + " au chocolat";
	}

	@Override
	public double cout() {
		return 0.7 + boisson.cout();
	}

}
