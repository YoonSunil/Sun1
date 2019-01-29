package com.method.call;
//인스턴스:메모리에 올라가 주소를 갖는 것
//클래스 안에는 변수 또는 메서드들이 올 수 있다.
public class CallTest{
	//전역변수는 초기화하지않으면 기본값으로 초기화 된다.
	static int point;//static 변수
	int point2;//인스턴스 변수


	public static void main(String[] asdf) {



		int[] answer= {1,4,4,3,2};
		for(int i=0;i<answer.length;i++) {
			System.out.print(answer[i]);
			for(int j=0;j<answer[i];j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		int[][] jpscr= {{100,90,80},{88,87,86},{44,47,49}};
		
		
		for(int i=0;i<jpscr.length;i++) {
			int jsum=0;
			for(int j=0;j<jpscr[i].length;j++) {
				jsum=jsum+jpscr[i][j];
				System.out.println(jpscr[i][j]);
			}
			System.out.println(jsum);
		}


		String asd= "ABCDE";
		for(int i=0;i<asd.length();i++) {

			char c= asd.charAt(i);
			System.out.println(c);

		}


		char[] eqasd= asd.toCharArray();
		System.out.println(eqasd);


		int[] stu= {100,80,90,77};
		int sum=0;
		for(int i=0;i<stu.length;i++) {
			sum=sum+stu[i];
			//System.out.println(tu[0]+stu[1]+stu[2]);	
		}
		System.out.println(sum);
		System.out.println((double)sum/stu.length);

		int[] dan= new int[] {1,2,3};
		for(int i=0;i<3;i++) {
			System.out.println(dan[i]+2);
		}

		for(int j=1;j<6;j++) {
			System.out.print(j);
		}
		System.out.println("");
		int[] k= {1,2,3,4,5,6,7,8,9};
		for(int g=0;g<k.length;g++) {
			System.out.println(k[g]+"단");
		}

		char[] mun= {'l','o','v','e'};
		System.out.println(mun);
		String[] a= new String[] {"aa","bb"};
		System.out.println(a[1]);



		int n = 1000000;
		int n2= 2000000;
		long nl1= (long) n*n2;

		int tot=80;
		String totres=(tot== 90)?"같다":"다르다"	;	
		//삼항연산자-> 디코드와 유사함
		//삼항연산자는 무한중복 가능함

		int score =80;
		char ress =(score>90)?'A':(score>=80)?'B':'C';


		CallTest v = new CallTest();
		System.out.println(v.point2);
		//int a;변수선언	
		//파라미터도 지역변수
		//지역변수는 반드시 초기화 해야된다.(최초값을 넣어야 한다)

		//기본(primitive)타입8개
		//참조(reference)타입:주소값(4byte)
		//boolean,char,byte,short,int,long,float,double)
		//string,system등등

		boolean bool= false;
		char c = 'c';
		byte b =127; //2^7-1


		short s = 32767;
		int i = 2147483647;//정수
		long ㅣ=2^64;

		float f= 3.0f; //리터럴1,d
		double d= 5.0; //소수점

		String aa="hello";
		System.out.println(aa);


		//상수:final이 붙은 변수
		//상수는 값을 초기화 한 후 재할당 불가능
		//상수는 대문자를 사용한다
		//상수는 _를 이용하여 표현해준다
		final int NOT_EDIT_NUM = 500;
		System.out.println(NOT_EDIT_NUM);

		//스트링은 null만 이용해서 초기화한다
		String str1 = null;
		//string str2 = '';//에러
		String str3 = "a";
		char ic =' ';
		//string에 어떠한 연산을 하여도 string
		int h= 100;
		int z= 50;
		System.out.println(str3+h+z);
		System.out.println(str3+(h+z));


		//int보다 작은 크기의 타입들을 더하면 결과는 int
		char calph = 'A';
		System.out.println(calph+1);

		//캐스팅:형변환(바꾸고싶은타입)
		System.out.println((char)(calph+1));

		//기본타입 8개중 boolean을 제외한 나머지는 서로 캐스팅가능
		boolean b1 = true;

		//참조타입 과 기본타입은 캐스팅 불가
		String numstr ="11";
		//System.out.println((int)numster);
		//Wrapper 클래스 사용시 참조타입과 기본타입이 캐스팅이 된다
		Boolean bw;
		//Blooean.parseBoolean("true")
		Float fwl;
		Byte btw;
		Character cw;
		//Character get


		Short sw;
		//Short.parseShort("14")
		Integer it;
		Long lw;
		//
		Float fw;
		Double dw;
		//Double.parseDouble("3,4")
		int res = add(2,3);
		int res2= sub(2,3);
		int res3= mul(2,3);
		double res4= div(2.0,3.0);
		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);



	}



	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static double div(double a,double b) {
		return a/b;
	}

}