import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// 사용자의 입력을 받아 1부터 사용자가 입력한 수까지 출력
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요.> ");
		String input= scanner.nextLine();
		num = Integer.parseInt(input);
		
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
	}
}
