package edu.mum.cs.cs425.Lab9.Lab9.arrayutils;

import java.util.Arrays;

public class ArrayFlattener {

	public int[] flatterArray(int[][] arr_in){
		if(arr_in == null) return null;
		
		return Arrays.stream(arr_in)
				.flatMapToInt(Arrays::stream)
				.toArray();
		//return null;
	}
}
