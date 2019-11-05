package com.yzhl.demo.condiment;

import com.yzhl.demo.Beverage;

public class Soy extends CondimentDecorator {
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDesc() {
		return beverage.getDesc() + ", " + this.getClass().getSimpleName();
	}

	@Override
	public double cost() {
		return 0.1D + beverage.cost();
	}
}
