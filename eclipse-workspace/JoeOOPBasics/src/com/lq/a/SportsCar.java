package com.lq.a;

public class SportsCar extends Car {

	private int horsePower;
	
	public int getHorsePower()  {
		
		return horsePower;
		
	}

	public void setHorsePower(int horsepower)  {
		this.horsePower = horsePower;
		
	}
	
	@override
	public int getSpeed()  {
		
	return super.getSpeed()*2;
	
	}
}
