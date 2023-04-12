import java.util.Scanner;

public class B9498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(90<=input&&input<=100) {
			System.out.print("A");
		}else if(80<=input) {
			System.out.print("B");
		}else if(70<=input) {
			System.out.println("C");
		}else if(60<=input) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
