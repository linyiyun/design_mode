package com.yzhl.demo.condiment;

import com.yzhl.demo.Beverage;

public class Milk extends CondimentDecorator {
	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return 0.22 + beverage.cost();
	}

	@Override
	public String getDesc() {
		return beverage.getDesc() + ", " + this.getClass().getSimpleName();
	}
}
