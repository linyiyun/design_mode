package com.yzhl.demo.coffee;

import com.yzhl.demo.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		desc = "首选咖啡";
	}

	@Override
	public double cost() {
		return 0.89D;
	}
}
