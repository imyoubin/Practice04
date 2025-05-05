package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		double[] doublearr = new double[3];
		
		doublearr[0]=6.7;
		doublearr[1]=3.3;
		doublearr[2]=1.2;

		//배열의 끝부터 처음으로 이동하여 출력한다.
		for(int i=0; i<doublearr.length; i++) {
			System.out.println(doublearr[i]);
		}
	}
}
