package com.lq.vehicle;

public abstract class Car {

	
	protected int speed;
	
	public boolean engineState;
	
	public abstract void setSpeed(int speed);
	
	public boolean isEngineState() {
		return engineState;
		
	}
	
	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}
	
	public int getSpeed() {
		return speed;
	}
}
