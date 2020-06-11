package edu.miu.cs.cs425.labassignment11.tddjunit;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.verify;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.miu.cs.cs425.labassignment11.tddjunit.utils.ArrayReversor;
import edu.miu.cs.cs425.labassignment11.tddjunit.utils.IArrayFlattenerService;



public class ArrayReversorTest {
	private ArrayReversor arrayReversor;
	private IArrayFlattenerService arrayFlattenerService = mock(IArrayFlattenerService.class);

	@Before
	public void setUp() throws Exception {
		this.arrayReversor = new ArrayReversor(arrayFlattenerService);
		 
	}

	@After
	public void tearDown() throws Exception {
		this.arrayReversor = null;
	}

	
	@Test
	public void testReverseArray() {
		Integer [][] twoD =  {{1,2,3}};
		when(arrayFlattenerService.flattenArray(twoD))
		.thenReturn(new Integer [] {1,2,3});
		Integer[] actual = arrayReversor.reverseArray(twoD);
		Integer[] expected = {3,2,1};
		assertArrayEquals(expected, actual);
		assertThat(actual, is(expected));
		verify(arrayFlattenerService).flattenArray(twoD);
		
	}
	
	@Test
	public void testReverseArrayForNulls() {
		Integer [][] twoD = null;
		when(arrayFlattenerService.flattenArray(twoD))
		.thenReturn(null);
		Integer[] actual = arrayReversor.reverseArray(twoD);
		Integer[] expected = null;
		assertArrayEquals(expected, actual);
		assertThat(actual, is(expected));
		verify(arrayFlattenerService).flattenArray(twoD);
	}
	

}
