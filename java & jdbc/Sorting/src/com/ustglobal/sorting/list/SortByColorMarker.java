package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByColorMarker implements Comparator<Marker> {

	@Override
	public int compare(Marker m1, Marker m2) {
		
		String s = m1.color;
		String t = m2.color;
		
		return s.compareToIgnoreCase(t);
	}

	
}
