package com.cg.BasicCollections.CollectionSet;

public class CarSet {

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

	public CarSet(String make, String model, int year, double price) {

		super();

		this.make = make;

		this.model = model;

		this.year = year;

		this.price = price;

	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarSet other = (CarSet) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override

	public String toString() {

		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";

	}

	

	



}