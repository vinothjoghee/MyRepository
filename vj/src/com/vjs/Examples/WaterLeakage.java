package com.vjs.Examples;

public class WaterLeakage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int capacityofwaterinliters=10;
		double leakageperhourinliter=2;
		double for70min=(70*leakageperhourinliter)/60;
		double totalleaked=2+for70min;
		double waterleft=capacityofwaterinliters-totalleaked;
		System.out.println("After 1 hour 10 min the water left is "+waterleft);
	}

}
