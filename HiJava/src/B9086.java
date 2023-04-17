import java.util.Scanner;

public class B9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String[] arr = new String[input];

		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.next();

		}
		for(int i=0;i<arr.length;i++) {

			System.out.print(arr[i].charAt(0));
			System.out.print(arr[i].charAt(arr[i].length()-1));
			System.out.println();
		}
	}
}
