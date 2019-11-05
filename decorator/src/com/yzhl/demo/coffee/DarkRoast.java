package com.yzhl.demo.coffee;

import com.yzhl.demo.Beverage;

public class DarkRoast  extends Beverage {
	public DarkRoast() {
		desc = "深度烘焙";
	}

	@Override
	public double cost() {
		return 0.99D;
	}
}
