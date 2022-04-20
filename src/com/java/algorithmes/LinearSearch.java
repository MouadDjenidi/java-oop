package com.java.algorithmes;

public class LinearSearch {

	/**
	 * Linear search algorithm runs O(1) in the best scenario O(n) in the worst
	 * scenario
	 */
	public static void main(String[] args) {
		callSearch();
	}
	
    private static void callSearch() {
    	int[] array = {300,0,23,432,3456,33,9,30,1};
    	int target = 1;
    	//int index = search1(array,target);
    	int index = search3(array,target);
    	System.out.println("the number "+target+" is in the index "+index);
    }
    
    /** before optimization */
    private static int search1(int[] array, int target) {
    	int n = 0;
    	int index = 0;
    	for(int i = 0; i < array.length; i++ ) {
    		n++;
    		if(array[i] == target) {
    			index = i;
    		}
    	}
    	System.out.println(n + " itiration to sort this array using search1 ");
    	return index;
    }
    
    /** after optimization */
    private static int search2(int[] array, int target) {
    	int n = 0;
    	int index = 0;
    	for(int i = 0; i < array.length; i++ ) {
    		n++;
    		if(array[i] == target) {
    			index = i;
    			break;
    		}
    	}
    	System.out.println(n + " itiration to sort this array using search2 ");
    	return index;
    }
    
    /** after optimization */
    private static int search3(int[] array, int target) {
    	int n = 0;
    	int index = 0;
    	for(int i = 0 ,j = array.length-1 ; i < array.length && j >= 0 ; i++ , j-- ) {
    		n++;
    		if( i > j ) {
    			break;
    		}else{
    			if(array[j] == target) index = j;
    			if(array[i] == target) index = i;
    			break;
    		}
    	}
    	System.out.println(n + " itiration to sort this array using search3 ");
    	return index;
    }
    
}
