package chap01;

//네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
public class Quiz1 {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println("max4(22,16,2,55) = " + max4(22,16,2,55));
		System.out.println("max4(4,65,32,1) = " + max4(4,65,32,1));
		
	}
}
