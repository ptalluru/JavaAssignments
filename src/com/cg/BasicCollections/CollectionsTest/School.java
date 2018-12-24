package com.cg.BasicCollections.CollectionsTest;

public class School {

	private String name,city,schoolDistrict;

	private int greatSchoolRanking;

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getCity() {

		return city;

	}

	public void setCity(String city) {

		this.city = city;

	}

	public String getSchoolDistrict() {

		return schoolDistrict;

	}

	public void setSchoolDistrict(String schoolDistrict) {

		this.schoolDistrict = schoolDistrict;

	}

	public int getGreatSchoolRanking() {

		return greatSchoolRanking;

	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {

		this.greatSchoolRanking = greatSchoolRanking;

	}

	public School(String name, String city, String schoolDistrict, int greatSchoolRanking) {

		super();

		this.name = name;

		this.city = city;

		this.schoolDistrict = schoolDistrict;

		this.greatSchoolRanking = greatSchoolRanking;

	}

	@Override

	public String toString() {

		return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict

				+ ", greatSchoolRanking=" + greatSchoolRanking + "]";

	}

	

	



}