package com.cg.BasicCollections.NamesInNaturalOrder;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CollectionAscendingOrderTest {
	private CollectionAscendingOrder nameOne,nameTwo,nameThree,nameFour,nameFive;
	@Before
	public void setUp(){
		nameOne =new CollectionAscendingOrder("Jaffar");
		nameTwo =new CollectionAscendingOrder("Prasanth");
		nameThree =new CollectionAscendingOrder("Sriram");
		nameFour =new CollectionAscendingOrder("Manoj");
		nameFive =new CollectionAscendingOrder("Ajay");
	}

	@Test
	public void ascendingTest() {
		List<CollectionAscendingOrder> nameList = new ArrayList<>();
		nameList.add(nameOne);
		nameList.add(nameTwo);
		nameList.add(nameThree);
		nameList.add(nameFour);
		nameList.add(nameFive);
		
		CollectionAscendingOrder passList = new CollectionAscendingOrder();
		String actual = passList.names(nameList).toString();
		String expected = "[CollectionAscendingOrder [name=Ajay],"
						+ " CollectionAscendingOrder [name=Jaffar],"
						+ " CollectionAscendingOrder [name=Manoj],"
						+ " CollectionAscendingOrder [name=Prasanth],"
						+ " CollectionAscendingOrder [name=Sriram]]";
		assertEquals(expected,actual);
		
	}

}
