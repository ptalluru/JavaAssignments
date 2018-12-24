package com.cg.BasicCollections.CollectionSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author ptalluru
 * 
 * 
 * 
 *Observe that Set doesn’t accept duplicate objects by writing an ddisplaying the elements in collection.
 *For each above object, override equals() and hashCode() methods and define the equality. 
 *Please see the criteria below. Create few equal objects (based on the below criteria)
 *and add them to HashSet and observe the fact that Set doesn’t accept duplicates (through equals() and hashCode()).
 *
 *Company and model  together define the equality for Laptop. If two laptops have same company and model then they are equal.
 *Car : make and model together define equality
 *Television : company, type (LCD, LED, Plasma) and price together define equality
 *CellPhone : company, model and operatingSstem together define equality
 *School : name, city and school district together define equality
 * 
 *
 */

public class CollectionsSetTest {
	private LaptopSet laptop1,laptop2,laptop3;

	private CarSet car1,car2,car3;

	private TelevisionSet television1,television2,television3;

	private CellPhoneSet cellPhone1,cellPhone2,cellPhone3;

	private SchoolSet school1,school2,school3;

	@Before

	public void setUp() {

		laptop1 = new LaptopSet("DELL","Model 1","Windows", "Intel i5");

		laptop2 = new LaptopSet("DELL", "Model 1", "Windows", "Intel i7");

		laptop3 = new LaptopSet("Lenovo", "Model 3", "Windows", "Intel");

		

		car1 = new CarSet("RR", "Model 1",2016, 50000);

		car2 = new CarSet("RR", "Model 1", 2017, 2500000);

		car3 = new CarSet("Skoda", "Model 3", 2018, 1500000);

		

		television1 = new TelevisionSet("Sony", "LCD", false, 50000);

		television2 = new TelevisionSet("Sony", "LCD", true, 50000);

		television3 = new TelevisionSet("SAMSUNG", "PLASMA", false, 25000);

		

		cellPhone1 = new CellPhoneSet("SAMSUNG", "NOTE", "NOTE9 : Retina Scan, Dual Camera", "ANDROID 8", 70000);

		cellPhone2 = new CellPhoneSet("APPLE", "IPHONE", "IPHONE X : A11 PROCESSOR", "IOS 11", 100000);

		cellPhone3 = new CellPhoneSet("SAMSUNG", "NOTE","McLAREN : New Edition", "ANDROID 8", 50000);

		

		school1 = new SchoolSet("LAP", "CHILLAKUR", "NELLORE", 2);

		school2 = new SchoolSet("CAM", "GUDUR", "NELLORE", 1);

		school3 = new SchoolSet("LAP", "CHILLAKUR", "NELLORE", 3);

		

	}



	@Test

	public void readList() {

		Set<Object> set = new HashSet<>();

		set.add(laptop1);

		set.add(laptop2);

		set.add(laptop3);

		set.add(car1);

		set.add(car2);

		set.add(car3);

		set.add(television1);

		set.add(television2);

		set.add(television3);

		set.add(cellPhone1);

		set.add(cellPhone2);

		set.add(cellPhone3);

		set.add(school1);

		set.add(school2);

		set.add(school3);

		

		Iterator<Object> iterator = set.iterator();

		for (Object o : set) {

			System.out.println(o);

		}
	}
}
