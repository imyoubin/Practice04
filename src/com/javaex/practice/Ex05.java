package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	//5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요.(배열)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] intNumbers= new int[5];
				
		int sum=0;
		
		for(int i=0; i<intNumbers.length; i++) {
			intNumbers[i]=sc.nextInt();
			sum=sum+intNumbers.length;			
		}
		double average = (double) sum/intNumbers.length;
		System.out.println("평균은 "+average+" 입니다.");
		sc.close();
	}

}
