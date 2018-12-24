package com.cg.assignmentsIO;

import java.io.Serializable;

public class ObjectWriter implements Serializable {
	private int id;
	private String Name;
	private double salary;
	public ObjectWriter(int id, String name, double salary) {
		super();
		this.id = id;
		Name = name;
		this.salary = salary;
	}
	public ObjectWriter() {
	}
	@Override
	public String toString() {
		return "ObjectWriter [id=" + id + ", Name=" + Name + ", salary="
				+ salary + "]";
	}
	
}
