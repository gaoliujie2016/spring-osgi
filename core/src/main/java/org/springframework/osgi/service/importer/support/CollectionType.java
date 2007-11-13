/*
 * Copyright 2002-2007 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.osgi.service.importer.support;

import org.springframework.core.enums.StaticLabeledEnum;
import org.springframework.osgi.service.importer.internal.collection.OsgiServiceList;
import org.springframework.osgi.service.importer.internal.collection.OsgiServiceSet;
import org.springframework.osgi.service.importer.internal.collection.OsgiServiceSortedList;
import org.springframework.osgi.service.importer.internal.collection.OsgiServiceSortedSet;

/**
 * Enumeration-like class which indicates the supported OSGi service collection
 * types. This class is used mainly for configuration purposes (such as parsing
 * the OSGi namespace).
 * 
 * @author Costin Leau
 * 
 */
public class CollectionType extends StaticLabeledEnum {

	private static final long serialVersionUID = 6165756098619186329L;

	/** unused */
	// public static final CollectionType COLLECTION = new CollectionType(1,
	// "collection", OsgiServiceCollection.class);
	/**
	 * Spring-managed list.
	 * @see java.util.List
	 */
	public static final CollectionType LIST = new CollectionType(2, "LIST", OsgiServiceList.class);

	/**
	 * Spring-managed set.
	 * @see java.util.Set
	 */
	public static final CollectionType SET = new CollectionType(3, "SET", OsgiServiceSet.class);

	/**
	 * Spring-managed sorted list.
	 * 
	 * @see java.lang.Comparable
	 * @see java.util.Comparator
	 * @see java.util.List
	 * @see java.util.SortedSet
	 */
	public static final CollectionType SORTED_LIST = new CollectionType(4, "SORTED_LIST", OsgiServiceSortedList.class);

	/**
	 * Spring-managed sorted Set.
	 * 
	 * @see java.lang.Comparable
	 * @see java.util.Comparator
	 * @see java.util.SortedSet
	 */
	public static final CollectionType SORTED_SET = new CollectionType(5, "SORTED_SET", OsgiServiceSortedSet.class);

	/** collection type */
	private final Class collectionClass;

	/**
	 * Return the actual collection class used underneath.
	 * 
	 * @return collection class
	 */
	public Class getCollectionClass() {
		return collectionClass;
	}

	private CollectionType(int code, String label, Class collectionClass) {
		super(code, label);
		this.collectionClass = collectionClass;
	}
}