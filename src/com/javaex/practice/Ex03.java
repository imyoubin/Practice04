package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		//20 6 10
		int[] intA = {3,6,9};
		
		int[] intB;
		intB=intA;		//intA 와 intB 는 같은 주소를 가지고 있음
		intB[0]=20;
		intB[2]=10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}
	}

}
