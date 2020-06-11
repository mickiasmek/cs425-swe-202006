package edu.miu.cs.cs425.labassignment11.tddjunit;

public class ArrayFlattener {
	public ArrayFlattener() {

	}

	public Integer[] flattenArray(Integer[][] twoDArray) {
		if(twoDArray == null) return null;
		Integer size = 0;
		for (Integer[] ints : twoDArray) {
			for (Integer j = 0; j < ints.length; j++) {
				size++;
			}
		}

		Integer[] flatArray = new Integer[size];
		Integer k = 0;
		for (Integer[] ints : twoDArray) {
			for (Integer anInt : ints) {
				flatArray[k] = anInt;
				k++;
			}
		}

		/*
		 * for(int a : flatArray){ System.out.print(a + ","); }
		 */

		return flatArray;
	}

	
}
