
public class ForEx1 {

	public static void main(String[] args) {
		// 1에서 10까지 출력
		for(int i = 1; i<=10; i++) {
			System.out.print(i);
		}
		System.out.println();
		
		
		// 1에서 10까지 정수합 출력(계산식도 같이)
		int sum = 0;
		for(int i=1;i<=10;i++) {
			System.out.printf("%2d + %2d = %2d%n",sum,i,sum+i);
			sum += i;
		}
		
		//홀수값 출력하기
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		
		//홀수값 더한값 출력하기
		int sum1=0;
		for(int i=1;i<=10;i+=2) {
			System.out.printf("%2d + %2d = %2d%n",sum1,i,sum1+=i);
		}
		
	}
}
