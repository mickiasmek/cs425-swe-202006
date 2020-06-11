package edu.miu.cs.cs425.labassignment11.tddjunit.utils;

public class ArrayReversor {

	private IArrayFlattenerService arrayFlattenerService;

	public ArrayReversor(IArrayFlattenerService arrayFlattenerService) {
		this.arrayFlattenerService = arrayFlattenerService;

	}

	public Integer[] reverseArray(Integer[][] twoDArray) {
		
		Integer [] flat = arrayFlattenerService.flattenArray(twoDArray);
		if(twoDArray == null) return null;
		Integer k = 0;
		for (Integer i = twoDArray.length - 1; i >= 0; i--) {
			Integer size = twoDArray[i].length -1;
			for (Integer j = size; j >= 0; j--) {
				flat[k] = twoDArray[i][j];
				k++;
			}
		}
		return flat;

	}
}
