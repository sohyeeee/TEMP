//1차원 배열 - 최소, 최대
import java.util.Scanner;

public class B10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[] arr = new int[input];
		
		for(int i=0;i<input;i++) {
			arr[i] = sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<input;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}		
		for(int i=0;i<input;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}	
		System.out.print(min+" "+max);
		
	}

}
