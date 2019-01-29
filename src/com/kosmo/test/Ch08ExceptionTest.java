package com.kosmo.test;
//예외처리의 목적:코드를 끝까지 실행해보고 발생된 예외를 처리함
public class Ch08ExceptionTest {
	public static void main(String[] awe) {
		//try{}catch{}무제한사용가능
		int[] arr=new int[2];
		try {
			System.out.println("1");
			System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch:exception");
		}
		System.out.println("2");
		try {
			System.out.println(arr[6]);//에러코드뒤에는 실행안된다
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch:exception2");//안에 중첩가능
		}finally {//예외발생유무와 관계없이 무조건 실행
			System.out.println("나는빡빡이다");
		}
		System.out.println("3");
		try {
			int res= 10/0;
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("산술적예외");
		}catch (Exception ae) {//모든 에러 캐칭
			System.out.println("혹C?");
		}
	}
}
