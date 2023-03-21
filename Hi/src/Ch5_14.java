
public class Ch5_14 {

	public static void main(String[] args) {
//		              01234  
		String str = "ABCDE";
		char ch = str.charAt(4);
		String str2 = str.substring(1,4);
		String str3 = str.substring(1); 
		//to부분 생략시 해당 인덱스 넘버부터 끝까지 출력(뒤에 생략이 str.length()로 생각하면 됨)
		System.out.println(ch);
		System.out.println(str2);
		System.out.println(str3);
	}
}

