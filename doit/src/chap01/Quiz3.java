package chap01;

import java.util.Random;

//네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
public class Quiz3 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		//간단히 4개 랜덤값 생성 (중복은 생각 안함)
		Random random = new Random();
		random.nextInt(100);
		
		int a, b, c, d;
		
		a = random.nextInt(100);
		b = random.nextInt(100);
		c = random.nextInt(100);
		d = random.nextInt(100);
		
		System.out.println("min4("+ a +","+ b +","+ c +","+ d +") = " + min4(a,b,c,d));
	}

}
