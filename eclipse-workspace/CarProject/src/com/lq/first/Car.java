package com.lq.first;

public class Car {

	private int speed;
	private int gasoline;
	private boolean engineState;
	
	
	Car ( int s, int g, boolean es ){
		speed = s;
		gasoline = g;
		engineState = es;
	}
	
//speed
	public void setSpeed( int s ) {
		speed = s;		
	}
		public int getSpeed() {
		return speed;
	}
	
//gasoline
    public void setGas( int t ) {
		gasoline = t;	
	}
	public int getGas() {
		return gasoline;
	}
	
//engineState
	public boolean isEngineState() {
		return engineState;			
	}
    public void setEngineState(boolean engineState) {
	    this.engineState = engineState;
}
	

	
}