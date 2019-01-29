package com.kosmo.test;

public class Ch05Array {
	public static void main(String[] args) {

		//		//타입[]_____=new 타입[크기];
		//		int[] numArr= new int[5];
		//		//타입선언하는 구간]
		//		//numArr[0]~numArr[크기-1]
		//		//배열은 선언+new생성 후 사용한다
		//		System.out.println(numArr);
		//
		//		int[] numArr2= new int[] {10,30,50};
		//
		//		int[] numArr3= {10,30,50};
		//
		//		int[] numArr4= new int[3];
		//		numArr4[0]=10;
		//		numArr4[1]=20;
		//		numArr4[2]=30;



		int[][] num= {{100,90,80,1},
				{88,87,86,1},
				{44,47,49,1}};

		int[][] jnum= new int[num.length+1][num[0].length+1];

		for(int i=0;i<num.length;i++) {


			for(int j=0;j<jnum.length;j++) {

				System.out.print(num[i][j]+"\t");
			}
			System.out.println();



		}
	}




}

