package com.yzhl.demo.coffee;

import com.yzhl.demo.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		desc = "脱因咖啡";
	}

	@Override
	public double cost() {
		return 1.05D;
	}
}
