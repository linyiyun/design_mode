package com.yzhl.demo.coffee;

import com.yzhl.demo.Beverage;

public class Espresso extends Beverage {
	public Espresso() {
		desc = "浓缩咖啡";
	}

	@Override
	public double cost() {
		return 1.99D;
	}
}
