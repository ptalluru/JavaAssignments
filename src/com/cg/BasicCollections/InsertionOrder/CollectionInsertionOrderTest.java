package com.cg.BasicCollections.InsertionOrder;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CollectionInsertionOrderTest {
	
	private CollectionInsertionOrder nameOrderOne,nameOrderTwo,nameOrderThree,nameOrderFour,nameOrderFive;
	@Before
	public void setUp(){
		nameOrderOne = new CollectionInsertionOrder("AJAY");
		nameOrderTwo = new CollectionInsertionOrder("Prasanth");
		nameOrderThree = new CollectionInsertionOrder("Sriram");
		nameOrderFour = new CollectionInsertionOrder("Manoj");
		nameOrderFive = new CollectionInsertionOrder("Jaffar");
	}
	@Test
	public void test() {
		List<Object> listOfNames = new ArrayList<>();
		listOfNames.add(nameOrderOne);
		listOfNames.add(nameOrderTwo);
		listOfNames.add(nameOrderThree);
		listOfNames.add(nameOrderFour);
		listOfNames.add(nameOrderFive);
		
		CollectionInsertionOrder passList = new CollectionInsertionOrder();
		List<Object>result=passList.names(listOfNames);
		assertEquals(listOfNames, result);
	}

}
