package com.kosmo.test;

import java.util.Scanner;

public class Ch04Loop {

	public static void main(String[] sdd) {
		//for(_start_,조건(end),_증감_){ ... }
		//while(조건문){...}
		//do{...}while(조건문)
		int i=1;
		for(; i<10; ) {
			System.out.println(i);
			i=i+1;		


		}
		for(int dan=2; dan<10;dan=dan+1) {
			System.out.println("\n"+dan+"단");
			for(int gob=1; gob<10;gob=gob+1) {
				System.out.print(dan+"*"+gob+"="+dan*gob+"\t");
			}

		}

		for(int rev=10; rev>0; rev=rev-1) {
			System.out.println(rev);
		}


		String job = "SALES";
		int num = 3;
		while(job=="SLAES") {
			System.out.println("true");
			num--;
			if(num == 0) break;
		}
		System.out.println("====done====");

		int a = 2 ;
		while(a<10) {
			int b=1;
			while(b<10) {
				System.out.print(a+"*"+b+"="+a*b);
				System.out.print("\t");
				b++;
			}
			System.out.println();
			a++;
		}

		int b = 1 ;
		while(b<10) {
			int d=2;
			while(d<10) {
				System.out.print(d+"*"+b+"="+d*b);
				System.out.print("\t");
				d++;
			}
			System.out.println();
			b++;
		}

//		String line = null;
//		do{
//			System.out.println("메세지");
//			Scanner s=new Scanner(System.in);
//			line = s.nextLine();
//
//		}while(!line.equals("q"));
//		System.out.println("정답입니다");

		int x=1;
		int sum=0;

		while(x<=10) {
			sum=sum+x;
			x++;
			if(x==11){
				System.out.println(sum);
			}
		}

		for(int d=1;d<7;d++){
			for(int j=0;j<d;j++){
				System.out.print("*");
			}
			System.out.println("");
		}


		
	}


}



