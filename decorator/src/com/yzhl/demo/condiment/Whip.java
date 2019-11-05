package com.yzhl.demo.condiment;

import com.yzhl.demo.Beverage;

public class Whip extends CondimentDecorator {
	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return 0.21 + beverage.cost();
	}

	@Override
	public String getDesc() {
		return beverage.getDesc() + ", " + this.getClass().getSimpleName();
	}
}
