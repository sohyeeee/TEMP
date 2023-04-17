//1차원 배열 - 과제 안내신분..?
import java.util.Scanner;

public class B5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[30];
		int[] input = new int[28];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		for(int j=0;j<input.length;j++) {
			input[j] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<input.length;j++) {
				if(arr[i]==input[j]) {
					arr[i]=0;
				}
			}
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
	}
}
