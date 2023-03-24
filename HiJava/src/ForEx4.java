import java.util.Scanner;

public class ForEx4 {
// 입력 받은 수가 소수인지 체크하는 프로그램(소수란 1과 자기자신으로만 나누어지는 2이상의 정수)
	public static void main(String[] args) {
		boolean check = true;
		int num=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.> ");
		String input = scanner.nextLine();
		num = Integer.parseInt(input);
		
		for(int i=2;i<num;i++) {
		
			if(num%i==0) {
				check=false;
				break;
			}else {
				check=true;
			}
		}
		if(check==false) {
			System.out.println("소수가 아닙니다.");
		}else
			System.out.println("소수입니다.");
	}
}
