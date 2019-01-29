package com.kosmo.test;

public class Ch08ThrowsTest {
	public static void main(String[] qwe) {
		System.out.println(1);
		try {
			myPrint();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(2);
		}finally {
		System.out.println(3);
		}
		System.out.println(4);
	}

	public static void myPrint() throws Exception{
		System.out.println("myPrint1111");
		try {
		int res=10/0;
		}catch(ArithmeticException d) {
			System.out.println("똑띠안하나");
		}
		System.out.println("myPrint2222");
		throw new Exception();
	}
}
