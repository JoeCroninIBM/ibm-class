package com.lq.vehicle;

public class SportsCar extends Car {

	

	private static final int MAX_SPEED = 200;
	
	@Override
	public void setSpeed(int speed) {
		if( speed > MAX_SPEED ) {
			this.speed = MAX_SPEED;
		} else {
			this.speed = speed;
		}
	}
		

	public void sp() {
		
	}
}
