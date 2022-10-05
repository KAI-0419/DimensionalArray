package com.test01;

public class DiArrayTest {

	public void testInit() {
		//선언
		int[][] iarr1;
		int iarr2[][];
		
		//할당
		iarr1 = new int[3][5];
		iarr2 = new int[3][];
		
		iarr2[0] = new int[5];
		iarr2[1] = new int[5];
		iarr2[2] = new int[5];
		
		for(int i=0; i<iarr2.length; i++) {
			for(int j=0; j<iarr2[i].length; j++) {
				 System.out.print(iarr2[i][j]+" ");
			}
			 System.out.println();
		}
	}
	
	public void testInit2() {
		int[][] iarr = new int[3][5];
		
//		iarr[0][0] = 1;
//		iarr[0][1] = 2;
//		iarr[0][2] = 3;
//		iarr[0][3] = 4;
//		iarr[0][4] = 5;
//		
//		iarr[1][0] = 6;
//		iarr[1][1] = 7;
//		iarr[1][2] = 8;
//		iarr[1][3] = 9;
//		iarr[1][4] = 10;
//		
//		iarr[2][0] = 11;
//		iarr[2][1] = 12;
//		iarr[2][2] = 13;
//		iarr[2][3] = 14;
//		iarr[2][4] = 15;
		
		
		int val = 1;
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j] = val++;
			}
		}
		printArray(iarr);
	}
	
	//이차원 배열을 전달받아 출력.
	public void printArray(int[][] iarr) {
		
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				System.out.print("\t" + iarr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void testInit3() {
		int[][] iarr = new int[3][];
		
		iarr[0] = new int[5];
		iarr[1] = new int[3];
		iarr[2] = new int[10];
		
		printArray(iarr);
		
		int[][] iarr2 = {{1,2,3},{4,5,6},{7,8,9}};
		printArray(iarr2);
		
		int[][] iarr3 = {{1},{2,3},{4,5,6},{7,8,9,10}};
		printArray(iarr3);
	}
}