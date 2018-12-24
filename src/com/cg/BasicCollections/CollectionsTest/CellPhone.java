package com.cg.BasicCollections.CollectionsTest;

public class CellPhone {



	private String company,model,description,operatingSystem;

	private double price;

	public String getCompany() {

		return company;

	}

	public void setCompany(String company) {

		this.company = company;

	}

	public String getModel() {

		return model;

	}

	public void setModel(String model) {

		this.model = model;

	}

	public String getDescription() {

		return description;

	}

	public void setDescription(String description) {

		this.description = description;

	}

	public String getOperatingSystem() {

		return operatingSystem;

	}

	public void setOperatingSystem(String operatingSystem) {

		this.operatingSystem = operatingSystem;

	}

	public double getPrice() {

		return price;

	}

	public void setPrice(double price) {

		this.price = price;

	}

	public CellPhone(String company, String model, String description, String operatingSystem, double price) {

		super();

		this.company = company;

		this.model = model;

		this.description = description;

		this.operatingSystem = operatingSystem;

		this.price = price;

	}

	@Override

	public String toString() {

		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description

				+ ", operatingSystem=" + operatingSystem + ", price=" + price + "]";

	}

	

	

}