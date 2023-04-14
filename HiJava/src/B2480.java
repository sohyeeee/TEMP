import java.util.Scanner;

public class B2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int reward;
		
		if(a==b && b==c) {
			reward = 10000 +(a*1000);
		}else if(a==b && b!=c) {
			reward = 1000+(a*100);
		}else if(a!=b && b==c) {
			reward = 1000+(b*100);
		}else if(a==c && b!=c) {
			reward = 1000+(c*100);
		}else {
			int max =a;
			if(max<b) {
				max=b;
			}if(max<c){
				max=c;
			}
			reward = max*100;
		}
		System.out.println(reward);
	}
}
