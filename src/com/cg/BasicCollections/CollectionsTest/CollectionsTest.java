package com.cg.BasicCollections.CollectionsTest;

import static org.junit.Assert.*;



import java.util.ArrayList;

import java.util.Iterator;

import java.util.List;



import org.junit.Before;

import org.junit.Test;

/**
 * 
 * @author ptalluru
 * 
 * 
 * Create classes for the below objects with the fields specified below.
 *Create three different instances for each type and add them to a collection.
 *Now, read from these collection and print each attribute in console.

 *Laptop : company, model, operatingSystem, processor
 *Car : make, model, year, price
 *Television : company, type (LCD, LED, Plasma), 3D enabled, price
 *CellPhone : company, model, description, operatingSstem, price
 *School : name, city, school district, greatSchoolRanking
 *
 *
 */

public class CollectionsTest {

	private Laptop laptop1,laptop2,laptop3;
	private Car car1,car2,car3;
	private Television television1,television2,television3;
	private CellPhone cellPhone1,cellPhone2,cellPhone3;
	private School school1,school2,school3;

	@Before

	public void setUp() {

		laptop1 = new Laptop("DELL","Model 1","Windows", "Intel i5");
		laptop2 = new Laptop("HP", "Model 2", "Windows", "Intel i7");
		laptop3 = new Laptop("Lenovo", "Model 3", "Windows", "Intel");

		car1 = new Car("Hyundai", "Model 1",2016, 50000);
		car2 = new Car("RR", "Model 2", 2017, 2500000);
		car3 = new Car("Skoda", "Model 3", 2018, 1500000);

		television1 = new Television("Sony", "LCD", false, 50000);
		television2 = new Television("LG", "LED", true, 200000);
		television3 = new Television("SAMSUNG", "PLASMA", false, 25000);

		cellPhone1 = new CellPhone("SAMSUNG", "NOTE", "NOTE9 : Retina Scan, Dual Camera", "ANDROID 8", 70000);
		cellPhone2 = new CellPhone("APPLE", "IPHONE", "IPHONE X : A11 PROCESSOR", "IOS 11", 100000);
		cellPhone3 = new CellPhone("ONE PLUS", "McLAREN","McLAREN : New Edition", "ANDROID 9", 50000);

		school1 = new School("LAP", "CHILLAKUR", "NELLORE", 2);
		school2 = new School("CAM", "GUDUR", "NELLORE", 1);
		school3 = new School("SRI CHAITANYA", "GUDUR", "NELLORE", 3);

	}

	@Test
	public void laptopList() {

		List<Object> list = new ArrayList<>();
		list.add(laptop1);
		list.add(laptop2);
		list.add(laptop3);	
		String actual=list.toString();
		String expected ="[Laptop [company=DELL, model=Model 1, operatingSystem=Windows, processor=Intel i5], "
						+ "Laptop [company=HP, model=Model 2, operatingSystem=Windows, processor=Intel i7], "
						+ "Laptop [company=Lenovo, model=Model 3, operatingSystem=Windows, processor=Intel]]";
		assertEquals(expected,actual);
		}
	
	@Test
	public void carTest() {
		List<Object> list = new ArrayList<>();
			list.add(car1);
			list.add(car2);
			list.add(car3);
		String actual=list.toString();
		String expected ="[Car [make=Hyundai, model=Model 1, year=2016, price=50000.0], "
						+ "Car [make=RR, model=Model 2, year=2017, price=2500000.0],"
						+ " Car [make=Skoda, model=Model 3, year=2018, price=1500000.0]]";
		assertEquals(expected,actual);
	}
	@Test
	public void televisionTest() {
		List<Object> list = new ArrayList<>();
			list.add(television1);
			list.add(television2);
			list.add(television3);
		String actual=list.toString();
		String expected ="[Television [company=Sony, type=LCD, enabled3d=false, price=50000.0],"
						+ " Television [company=LG, type=LED, enabled3d=true, price=200000.0],"
						+ " Television [company=SAMSUNG, type=PLASMA, enabled3d=false, price=25000.0]]";
		assertEquals(expected,actual);
	}

	@Test
	public void cellPhoneTest() {
		List<Object> list = new ArrayList<>();
			list.add(cellPhone1);
			list.add(cellPhone2);
			list.add(cellPhone3);
		String actual=list.toString();
		String expected ="[CellPhone [company=SAMSUNG, model=NOTE, description=NOTE9 : Retina Scan, Dual Camera, operatingSystem=ANDROID 8, price=70000.0],"
				+ " CellPhone [company=APPLE, model=IPHONE, description=IPHONE X : A11 PROCESSOR, operatingSystem=IOS 11, price=100000.0],"
				+ " CellPhone [company=ONE PLUS, model=McLAREN, description=McLAREN : New Edition, operatingSystem=ANDROID 9, price=50000.0]]";
		assertEquals(expected,actual);
	}

	
	@Test
	public void schoolTest() {
		List<Object> list = new ArrayList<>();
		list.add(school1);
		list.add(school2);
		list.add(school3);
		String actual=list.toString();
		String expected ="[School [name=LAP, city=CHILLAKUR, schoolDistrict=NELLORE, greatSchoolRanking=2],"
						+ " School [name=CAM, city=GUDUR, schoolDistrict=NELLORE, greatSchoolRanking=1],"
						+ " School [name=SRI CHAITANYA, city=GUDUR, schoolDistrict=NELLORE, greatSchoolRanking=3]]";
		assertEquals(expected,actual);
	}
}