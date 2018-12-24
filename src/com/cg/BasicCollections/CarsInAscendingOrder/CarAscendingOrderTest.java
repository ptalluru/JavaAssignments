package com.cg.BasicCollections.CarsInAscendingOrder;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author ptalluru
 * 
 *Create few instances of Car and add them to a collection. 
 *Have Car implements Comparable interface and override compareTo() to order them by ascending order of make of the Car.
 *Observe the fact that you need to provide the order criteria in compareTo().
 *
 */

public class CarAscendingOrderTest {
	private CarAscendingOrder carOne,carTwo,carThree,carFour,carFive;
	@Before
	public void setUp(){
		carOne = new CarAscendingOrder("Hyundai","Model 1",2016,1000000);
		carTwo = new CarAscendingOrder("RR","Model 2",2017,2500000);
		carThree = new CarAscendingOrder("Astra","Model 3",2018,1500000);
		carFour = new CarAscendingOrder("Bentley","Model 4",2019,2000000);
		carFive = new CarAscendingOrder("Tata","Model 5",2020,400000);
	}
	@Test
	public void ascendingOrderTest() {
		List<CarAscendingOrder> carLists = new ArrayList<>();
		carLists.add(carOne);
		carLists.add(carTwo);
		carLists.add(carThree);
		carLists.add(carFour);
		carLists.add(carFive);
		
		CarAscendingOrder car = new CarAscendingOrder();
		String actual = car.ascending(carLists).toString();
		String expected ="[CarAscendingOrder [make=Astra, model=Model 3, year=2018, price=1500000.0],"
					+ " CarAscendingOrder [make=Bentley, model=Model 4, year=2019, price=2000000.0],"
					+ " CarAscendingOrder [make=Hyundai, model=Model 1, year=2016, price=1000000.0],"
					+ " CarAscendingOrder [make=RR, model=Model 2, year=2017, price=2500000.0],"
					+ " CarAscendingOrder [make=Tata, model=Model 5, year=2020, price=400000.0]]";
		assertEquals(expected,actual);
		
		
		
	}

}