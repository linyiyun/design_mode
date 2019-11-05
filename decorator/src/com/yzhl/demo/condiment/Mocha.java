package com.yzhl.demo.condiment;

import com.yzhl.demo.Beverage;

public class Mocha extends CondimentDecorator {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return 0.32 + beverage.cost();
	}

	@Override
	public String getDesc() {
		return beverage.getDesc() + ", " + this.getClass().getSimpleName();
	}
}
