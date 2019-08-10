package edu.mum.cs.cs425.Lab9_2.Lab9_2;

public class ArrayReservor {

	private ArrayFlattenerService arrayFlattenerService;
	
	public ArrayReservor(ArrayFlattenerService arrayFlattenerService) {
		this.arrayFlattenerService = arrayFlattenerService;
	}
	
	
	public int[] reverseArray(int[][] a_in) {
      int[] a_flat = arrayFlattenerService.flattenArray(a_in);

      if(a_flat == null)
          return null;
      int i = 0;
      int j = a_flat.length - 1;
      while(i < j) {
          int temp = a_flat[i];
          a_flat[i] = a_flat[j];
          a_flat[j] = temp;
          i++;
          j--;
      }
      return a_flat;
	}
	
}
