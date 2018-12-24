package com.cg.BasicCollections.NamesInNaturalOrder;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author ptalluru
 * 
 *Add all the names of our class students randomly to a collection, 
 *iterate through them and print. Observe that collection keeps these elements in a natural order.
 *
 */
public class CollectionAscendingOrder implements Comparable<CollectionAscendingOrder>{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CollectionAscendingOrder(String name) {
		super();
		this.name = name;
	}


	public CollectionAscendingOrder() {
	}

	@Override
	public String toString() {
		return "CollectionAscendingOrder [name=" + name + "]";
	}

	@Override
	public int compareTo(CollectionAscendingOrder collectionAscendingOrder) {
		return this.name.compareTo(collectionAscendingOrder.name);
	}

	public List<CollectionAscendingOrder> names(List<CollectionAscendingOrder> nameList) {
		Iterator<CollectionAscendingOrder> iterateNames = nameList.iterator();
		Collections.sort(nameList);
		return nameList;
	}
}
