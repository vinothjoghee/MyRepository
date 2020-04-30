package com.k2js.oop.abstractclass;

abstract class MomCarrotSweet implements CarrotSweet{
	public void buyCarrots() {
		System.out.println("Mom brought 500 grms carrots");
	}
	public void pealCarrots() {
		System.out.println("Mom pealed carrot and cleared");
	}
	public void grateCarrots() {
		System.out.println("Mom grated carrots into small pieces");
	}
	public void switchOnStove() {
		System.out.println("Mom switched on stove");
	}
	public void boilMilk() {
		System.out.println("Mom boiled milk");
	}
	public void addSugar() {
		System.out.println("Mom added 250 grams of sugar");
	}
	public void mixGratedSugar() {
		System.out.println("Mom mixed all grated carrots");
	}
	public void switchOffStove() {
		System.out.println("Mom switched off stove");
	}
	abstract void addGarnish();

}
