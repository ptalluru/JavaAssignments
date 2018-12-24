package com.cg.BasicCollections.Map;

public class HashMapping {
	private String fruits;

	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}

	public HashMapping(String fruits) {
		super();
		this.fruits = fruits;
	}

	public HashMapping() {
	}

	@Override
	public String toString() {
		return "HashMapping [fruits=" + fruits + "]";
	}

}
