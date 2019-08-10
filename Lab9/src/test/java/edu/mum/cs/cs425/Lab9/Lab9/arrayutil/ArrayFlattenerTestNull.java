package edu.mum.cs.cs425.Lab9.Lab9.arrayutil;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.Lab9.Lab9.arrayutils.ArrayFlattener;

public class ArrayFlattenerTestNull {
	private ArrayFlattener arrayFlattener;

	@Before
	public void setUp() throws Exception {
		this.arrayFlattener = new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
		this.arrayFlattener = null;
	}

	@Test
	public void testFlatterArray() {
		int[][] a_in = null;
		int[] actuals = arrayFlattener.flatterArray(a_in);
		int[] expecteds = null;
		Assert.assertEquals(expecteds, actuals);
	}

}
