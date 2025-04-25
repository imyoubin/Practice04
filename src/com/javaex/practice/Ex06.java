package com.javaex.practice;

public class Ex06 {
	/*
	 * Ex06 주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요.
	   char c[] = {'T','h','i','s',' ','i','s',' ','a',' 
	   ','p','e','n','c','i','l'};
	 */
	public static void main(String[] args) {
		char[] cahrC = new char[] {'t','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'}; 
		
		for(int i=0; i<cahrC.length; i++) {
			System.out.print(cahrC[i]);			
		}
		System.out.println("");
		for(int i=0; i<cahrC.length; i++) {
			if(cahrC[i]==' ') {
				System.out.print(',');				
			}
			System.out.print(cahrC[i]);
			
		}
		
	}

}
