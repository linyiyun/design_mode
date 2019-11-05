package com.yzhl.demo;

import com.yzhl.demo.size.Size;

import javax.print.attribute.standard.Sides;

/**
 * 饮料接口，提供一个计算价格的方法
 */
public abstract class Beverage {
	protected String desc = "未知的饮料";
	private Size size;

	public void setSize(Size size) {
		this.size = size;
	}

	public abstract double cost();

	public String getDesc() {
		return desc;
	}
}
