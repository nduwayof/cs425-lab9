package edu.mum.cs.cs425.Lab9.Lab9.arrayutil;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.Lab9.Lab9.arrayutils.ArrayFlattener;

public class ArrayFlatenerTest {
ArrayFlattener arrayFlattener;
	
	@Before
	public void setUp() throws Exception {
		this.arrayFlattener = new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
		this.arrayFlattener = null;
	}

	@Test
	public void test() {
		int[][] a_in = new int[][] {{1,3},{0},{4,5,9}};
		int[] actuals = arrayFlattener.flatterArray(a_in);
		int[] expecteds = new int[] {1,3,0,4,5,9};
		Assert.assertArrayEquals(expecteds, actuals);
	}

}
