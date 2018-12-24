package com.cg.BasicCollections.InsertionOrder;

import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author ptalluru
 * 
 * Add all the names of our class students randomly to a collection, iterate through them and print. 
 *Observe that collection is maintaining the order that you add.
 *
 */
public class CollectionInsertionOrder {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CollectionInsertionOrder(String name) {
		super();
		this.name = name;
	}

	public CollectionInsertionOrder() {
	}

	@Override
	public String toString() {
		return "CollectionInsertionOrder [name=" + name + "]";
	}
	
	
	public List<Object> names(List<Object> listOfNames) {
		Iterator<Object> iterateNames = listOfNames.iterator();
		for(Object names : listOfNames){
			System.out.println(names);
		}
		return listOfNames;
	}
}
