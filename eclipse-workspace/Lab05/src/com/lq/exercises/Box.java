package com.lq.exercises;

public class Box {

	private double height;
	private double width;
	private double length;
	
	Box(double h, double w, double l){
		setHeight (h);
		setWidth (w);
		setLength (l);
	}
	
	Box(double side){
		//height = width = length = side;
		this(side,side,side);
	}
	
	private double height, width, length;

	/**
	 * @return the height
	 */
	public final double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public final void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public final double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public final void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public final double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public final void setLength(double length) {
		this.length = length;
	}

}