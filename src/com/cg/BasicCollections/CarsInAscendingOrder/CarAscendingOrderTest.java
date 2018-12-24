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
	public void test() {
		List<CarAscendingOrder> carLists = new ArrayList<>();
		carLists.add(carOne);
		carLists.add(carTwo);
		carLists.add(carThree);
		carLists.add(carFour);
		carLists.add(carFive);
		
		CarAscendingOrder car = new CarAscendingOrder();
		car.ascending(carLists);
	}

}