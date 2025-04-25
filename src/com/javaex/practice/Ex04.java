package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		int[] intdata = new int[] {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};

        int count = 0; 
        int sum = 0;   

        for (int i = 0; i < intdata.length; i++) {
            if (intdata[i] % 3 == 0) {
                count++;
                sum += intdata[i];
            }
        }

        System.out.println("3의 배수의 개수: " + count);
        System.out.println("3의 배수의 합: " + sum);
	}

}
