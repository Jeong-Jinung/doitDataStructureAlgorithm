package chap01;

import java.util.Random;

//세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
public class Quiz2 {
	
	static int min3(int a, int b, int c) {
		
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		//간단히 3개 랜덤값 생성 (중복은 생각 안함)
		Random random = new Random();
		random.nextInt(100);
		
		int a, b, c;
		
		a = random.nextInt(100);
		b = random.nextInt(100);
		c = random.nextInt(100);
		
		System.out.println("min4("+ a +","+ b +","+ c +") = " + min3(a,b,c));
	}

}
