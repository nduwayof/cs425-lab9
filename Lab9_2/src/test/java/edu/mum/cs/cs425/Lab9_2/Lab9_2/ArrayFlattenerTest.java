package edu.mum.cs.cs425.Lab9_2.Lab9_2;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;

import junit.framework.TestCase;

public class ArrayFlattenerTest extends TestCase {

	private ArrayReservor arrayReversor;
	private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);
	
	protected void setUp() throws Exception {
		this.arrayReversor = new ArrayReservor(arrayFlattenerService);
	}

	protected void tearDown() throws Exception {
		  this.arrayReversor = null;
	}

	public void testReverseArray() {
		
		 	int[][] a_in = new int[][]{{1,3}, {0}, {4,5,9}};
	        when(arrayFlattenerService.flattenArray(a_in)).thenReturn(new int[]{1,3,0,4,5,9});
	        int[] actuals = arrayReversor.reverseArray(a_in);
	        int[] expecteds = new int[]{9,5,4,0,3,1};
	        Assert.assertArrayEquals(expecteds, actuals);
	        verify(arrayFlattenerService).flattenArray(a_in);
	}

}
