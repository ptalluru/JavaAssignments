package com.cg.BasicCollections.CollectionsTest;

public class Television {

	private String company,type;

	private boolean enabled3d;

	private double price;

	public String getCompany() {

		return company;

	}

	public void setCompany(String company) {

		this.company = company;

	}

	public String getType() {

		return type;

	}

	public void setType(String type) {

		this.type = type;

	}

	public boolean isEnabled3d() {

		return enabled3d;

	}

	public void setEnabled3d(boolean enabled3d) {

		this.enabled3d = enabled3d;

	}

	public double getPrice() {

		return price;

	}

	public void setPrice(double price) {

		this.price = price;

	}

	public Television(String company, String type, boolean enabled3d, double price) {

		super();

		this.company = company;

		this.type = type;

		this.enabled3d = enabled3d;

		this.price = price;

	}

	@Override

	public String toString() {

		return "Television [company=" + company + ", type=" + type + ", enabled3d=" + enabled3d + ", price=" + price

				+ "]";

	}

	

	



}