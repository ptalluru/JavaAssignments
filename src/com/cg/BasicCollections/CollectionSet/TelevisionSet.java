package com.cg.BasicCollections.CollectionSet;

public class TelevisionSet {

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

	public TelevisionSet(String company, String type, boolean enabled3d, double price) {

		super();

		this.company = company;

		this.type = type;

		this.enabled3d = enabled3d;

		this.price = price;

	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		TelevisionSet other = (TelevisionSet) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override

	public String toString() {

		return "Television [company=" + company + ", type=" + type + ", enabled3d=" + enabled3d + ", price=" + price

				+ "]";

	}

	

	



}