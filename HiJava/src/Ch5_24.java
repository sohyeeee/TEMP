import java.util.Arrays;

public class Ch5_24 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};  //1차원 배열 
		int[][] arr2D = {{11,12},{21,22}};  //2차원 배열
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
//		System.out.println(str2D==str2D2); //참조변수 값 비교
		System.out.println(Arrays.deepEquals(str2D, str2D2)); 
		
//		int[] arr2 = Arrays.copyOf(arr, arr.length);
//		int[] arr2 = Arrays.copyOf(arr, 3);
//		int[] arr2 = Arrays.copyOf(arr, 7);
		int[] arr2 = Arrays.copyOfRange(arr, 2, 4);
		
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = {4,3,1,0,2};
		System.out.println(Arrays.toString(arr3));
		Arrays.sort(arr3); // 배열 arr을 오름차순으로 정렬
		System.out.println(Arrays.toString(arr3));
	}
}

