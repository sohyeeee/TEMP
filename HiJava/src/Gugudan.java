//사용자로부터 구구단 단수 입력받아 출력하기(메서드 실습)
import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputGugu = 0;
		while(true) {
		System.out.print("구구단은 몇 단? ");
		inputGugu = scanner.nextInt();

		print p = new print();

		p.printGugudan(inputGugu);
		}
	}
}

class print{
	void printGugudan(int dan) {
		if(!(2<dan && dan<=9)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n",dan,i,dan*i);
		}
	}
}
