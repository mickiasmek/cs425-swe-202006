package edu.miu.cs.cs425.labassignment11.tddjunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayFlattenerTest {
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
	public void testFlattenArray() {
		Integer[][] my2dArray = { { 1, 3 }, { 0 }, { 4, 5, 9 } };
		Integer[] expected = { 1, 3, 0, 4, 5, 9 };
		Integer[] actual = this.arrayFlattener.flattenArray(my2dArray);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testFlattenArrayForNulls() {
		Integer[][] my2dArray = null;
		Integer[] expected = null;
		Integer[] actual = this.arrayFlattener.flattenArray(my2dArray);
		Assert.assertArrayEquals(expected, actual);
	}

}
