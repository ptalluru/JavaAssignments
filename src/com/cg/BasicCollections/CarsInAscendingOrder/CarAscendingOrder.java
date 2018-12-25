package com.cg.BasicCollections.CarsInAscendingOrder;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CarAscendingOrder implements Comparable<CarAscendingOrder>{

	private String make,model;
	private int year;
	private double price;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CarAscendingOrder(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public CarAscendingOrder() {
	}
	@Override
	public String toString() {
		return "CarAscendingOrder [make=" + make + ", model=" + model
				+ ", year=" + year + ", price=" + price + "]";
	}
	@Override
	public int compareTo(CarAscendingOrder carAscendingOrder) {
		return this.make.compareTo(carAscendingOrder.make);
	}
	public List<CarAscendingOrder> ascending(List<CarAscendingOrder> carLists) {
		Iterator<CarAscendingOrder> iterate = carLists.iterator();
		Collections.sort(carLists);
		return carLists;
	}
	
}
