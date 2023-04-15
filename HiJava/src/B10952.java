import java.util.Scanner;

public class B10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		while(true) {
			x = sc.nextInt();
			y = sc.nextInt();
			if(x==0&&y==0) {
				break;
			}
			System.out.println(x+y);
		}
	}
}
