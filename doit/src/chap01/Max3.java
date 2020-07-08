
package chap01;

import java.util.Scanner;

//3개의 정수값을 입력하고 최댓값을 구합니다.
public class Max3 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.print("a의 값: "); int a = stdIn.nextInt();
		System.out.print("b의 값: "); int b = stdIn.nextInt();
		System.out.print("c의 값: "); int c = stdIn.nextInt();

		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;

		System.out.println("최대값은 " + max + "입니다.");
	}
}

/*
[ Scanner 클래스에 포함되어 있는 next... 메서드 ]
=================================================
메서드			자료형		입력값 범위
nextBoolean()	boolean		true 또는 false
nextByte()		byte		-128 ~ +127
nextShort()		short		-32768 ~ +32767
nextInt()		int			-2147483648 ~ +2147483647
nextLong()		long		-9223372036854775808 ~ +92233772036854775807
nextFloat()		float		±3.40282347E+38 ~ ±1.40239846E-45
nextDouble()	double		±1.79769313486231507E+378 ~ ±4.94065645841246544E-324
next()			String		문자열(스페이스, 줄 바꿈 문자로 구분)
nextLine()		String		문자열 한줄
 */

