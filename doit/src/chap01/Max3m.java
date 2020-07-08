package chap01;

//3개의 정수값 가운데 최댓값을 구하여 출력한다.
// [알고리즘] : 문제를 해결하기 위한 것으로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합
public class Max3m {
	
	static int max3(int a, int b, int c) {
		int max = a;
		
		if(b > max) {
			max = b;
		}
		if(c > max ) {
			max = c;
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(3,2,2) = " + max3(3,2,2));
	}
}
/*
[ 매개변수 ]
메서드를 정의할 때 메서드에 전달되는 값을 저장하기 위한 변수(variable)를 선언하는데,
이를 매개변수(parameter) 또는 형식매개변수(formal parameter)라고 한다.
형식매개변수를 가인수(임시인수)라 하고 메서드를 호출할 떄 사용하는 매개변수의 값(value)을 실인수(actual argument)라고 한다.
간단하게 메서드를 정의할 때는 '매개변수', 메서드를 호출할 때는 '실인수'라고 생각하면 됨
*/
