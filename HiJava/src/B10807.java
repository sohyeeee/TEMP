//1차원 배열 - 개수 세기
import java.util.Scanner;

public class B10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		int cnt=0;

		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}

		int find = sc.nextInt();

		for(int i=0;i<num;i++) {
			if(arr[i]==find) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}

}
