package com.lq.first;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car (40, 20, true);
		Car c2 = new Car (50, 30, false);
	
		/*
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.setSpeed(40);
		c1.setGas(60);
		c1.setEngineState(true);
		c2.setSpeed(70);
		c2.setGas(45);
		c2.setEngineState(true);
		*/
		
		System.out.println( "Car 1: " + c1.getSpeed() + " MPH " + c1.getGas() + " On/Off: " + c1.isEngineState() );
		System.out.println( "Car 2: " + c2.getSpeed() + " MPH " + c2.getGas() + " On/Off: " + c2.isEngineState() );
	}

}
