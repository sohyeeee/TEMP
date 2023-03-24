import java.util.Scanner;

public class ForEx3_fact {

	public static void main(String[] args) {
		// 팩토리얼 계산하기
		
		int num = 0;
		int fact =1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요.> ");
		String input = scanner.nextLine();
		num = Integer.parseInt(input);
		
		for(int i=1; i<=num; i++) {
			System.out.printf("%3d = %3d * %3d%n",fact*i,fact,i);
			fact *= i;
		}
		System.out.printf("%d!은 %d입니다",num,fact);
	}
}
