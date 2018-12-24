package com.cg.BasicCollections.Map;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author ptalluru
 * 
 * Create a simple map to store all of our class students’ names and their favorite fruits.
 *Try to get their favorite fruit by giving their name. Also, list all the names and their favorite fruits saperately.
 *
 */

public class MapTest {
	private HashMapping hashOne, hashTwo, hashThree, hashFour, hashFive;

	@Before
	public void setUp() {
		hashOne = new HashMapping("Apple");
		hashTwo = new HashMapping("Strawberry");
		hashThree = new HashMapping("Banana");
		hashFour = new HashMapping("BlackBerry");
		hashFive = new HashMapping("PineApple");
	}

	@Test
	public void mappingTest() {
		Map<String, HashMapping> favourite = new HashMap<String, HashMapping>();
		favourite.put("Ajay", hashOne);
		favourite.put("Prasanth", hashTwo);
		favourite.put("Jaffar", hashThree);
		favourite.put("Sriram", hashFour);
		favourite.put("Manoj", hashFive);

		Set set = favourite.entrySet();
		Iterator iterate = set.iterator();
		String actual=set.toString();
		String expected = "[Jaffar=HashMapping [fruits=Banana],"
						+ " Prasanth=HashMapping [fruits=Strawberry],"
						+ " Ajay=HashMapping [fruits=Apple],"
						+ " Sriram=HashMapping [fruits=BlackBerry],"
						+ " Manoj=HashMapping [fruits=PineApple]]";
		assertEquals(expected,actual);
		
		String expectedFavourite = "HashMapping [fruits=BlackBerry]";
		assertEquals(expectedFavourite,favourite.get("Sriram").toString());
	}
}
