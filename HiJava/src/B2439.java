import java.util.Scanner;

public class B2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input-i;j++) {
				System.out.print(" ");
			}
			for(int x=1;x<=i;x++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
