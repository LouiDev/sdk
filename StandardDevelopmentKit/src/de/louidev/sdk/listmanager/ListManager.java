package de.louidev.sdk.listmanager;

import java.util.List;

public class ListManager {
	
	// Biggest of
	public static int biggestInt(List<Integer> list) {
		if(list.isEmpty()) return 0;
		int biggest = list.get(0);
		for(int i : list) {
			if(i > biggest) biggest = i;
		}
		return biggest;
	}
	
	public static long biggestLong(List<Long> list) {
		if(list.isEmpty()) return 0;
		long biggest = list.get(0);
		for(long i : list) {
			if(i > biggest) biggest = i;
		}
		return biggest;
	}
	
	public static float biggestFloat(List<Float> list) {
		if(list.isEmpty()) return 0;
		float biggest = list.get(0);
		for(float i : list) {
			if(i > biggest) biggest = i;
		}
		return biggest;
	}
	
	public static double biggestDouble(List<Double> list) {
		if(list.isEmpty()) return 0;
		double biggest = list.get(0);
		for(double i : list) {
			if(i > biggest) biggest = i;
		}
		return biggest;
	}
	
	// Smallest of
	public static int smallestInt(List<Integer> list) {
		if(list.isEmpty()) return 0;
		int smallest = list.get(0);
		for(int i : list) {
			if(i < smallest) smallest = i;
		}
		return smallest;
	}
	
	public static long smallestLong(List<Long> list) {
		if(list.isEmpty()) return 0;
		long smallest = list.get(0);
		for(long i : list) {
			if(i < smallest) smallest = i;
		}
		return smallest;
	}
	
	public static float smallestFloat(List<Float> list) {
		if(list.isEmpty()) return 0;
		float smallest = list.get(0);
		for(float i : list) {
			if(i < smallest) smallest = i;
		}
		return smallest;
	}
	
	public static double smallestDouble(List<Double> list) {
		if(list.isEmpty()) return 0;
		double smallest = list.get(0);
		for(double i : list) {
			if(i < smallest) smallest = i;
		}
		return smallest;
	}
	
	// To array
	public static int[] toIntArray(List<Integer> list) {
		int[] array = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
	
	public static long[] toLongArray(List<Long> list) {
		long[] array = new long[list.size()];
		for(int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
	
	public static float[] toFloatArray(List<Float> list) {
		float[] array = new float[list.size()];
		for(int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
	
	public static double[] toDoubleArray(List<Double> list) {
		double[] array = new double[list.size()];
		for(int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
	
	public static String[] toStringArray(List<String> list) {
		String[] array = new String[list.size()];
		for(int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}
	
	// Sorting algorithm
	/*
	 * Warning: time complexity of n squared 
	 */
	public static int[] selectionsortInt(int[] array) {
		if(array.length == 0) return array;
		int startingIndex = 0;
		int currentLowestIndex = startingIndex;
		for(startingIndex = 0; startingIndex != array.length - 1; startingIndex++) {
			for(int j = startingIndex + 1; j != array.length; j++) {
				if(array[j] < array[currentLowestIndex]) currentLowestIndex = j;
			}
			int oldLowest = array[currentLowestIndex];
			array[currentLowestIndex] = array[startingIndex];
			array[startingIndex] = oldLowest;
		}
		return array;
	}
	
	/*
	 * Warning: time complexity of n squared 
	 */
	public static long[] selectionsortInt(long[] array) {
		if(array.length == 0) return array;
		int startingIndex = 0;
		int currentLowestIndex = startingIndex;
		for(startingIndex = 0; startingIndex != array.length - 1; startingIndex++) {
			for(int j = startingIndex + 1; j != array.length; j++) {
				if(array[j] < array[currentLowestIndex]) currentLowestIndex = j;
			}
			long oldLowest = array[currentLowestIndex];
			array[currentLowestIndex] = array[startingIndex];
			array[startingIndex] = oldLowest;
		}
		return array;
	}
	
	/*
	 * Warning: time complexity of n squared 
	 */
	public static float[] selectionsortInt(float[] array) {
		if(array.length == 0) return array;
		int startingIndex = 0;
		int currentLowestIndex = startingIndex;
		for(startingIndex = 0; startingIndex != array.length - 1; startingIndex++) {
			for(int j = startingIndex + 1; j != array.length; j++) {
				if(array[j] < array[currentLowestIndex]) currentLowestIndex = j;
			}
			float oldLowest = array[currentLowestIndex];
			array[currentLowestIndex] = array[startingIndex];
			array[startingIndex] = oldLowest;
		}
		return array;
	}
	
	/*
	 * Warning: time complexity of n squared 
	 */
	public static double[] selectionsortInt(double[] array) {
		if(array.length == 0) return array;
		int startingIndex = 0;
		int currentLowestIndex = startingIndex;
		for(startingIndex = 0; startingIndex != array.length - 1; startingIndex++) {
			for(int j = startingIndex + 1; j != array.length; j++) {
				if(array[j] < array[currentLowestIndex]) currentLowestIndex = j;
			}
			double oldLowest = array[currentLowestIndex];
			array[currentLowestIndex] = array[startingIndex];
			array[startingIndex] = oldLowest;
		}
		return array;
	}
	
}
