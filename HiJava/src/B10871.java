//1차원 배열 - x보다 작은 수
import java.util.Scanner;

public class B10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numArr = sc.nextInt();
		int numInt = sc.nextInt();

		int[] arr = new int[numArr];

		for(int i=0;i<numArr;i++) {
			arr[i] = sc.nextInt();
		}

		for(int i=0;i<numArr;i++) {
			if(arr[i]<numInt) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
