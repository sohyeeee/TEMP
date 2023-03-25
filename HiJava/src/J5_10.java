import java.util.Scanner;

public class J5_10 {

	public static void main(String[] args) {
		String[][] words = {
				{"apple","tiger","hospital"},//words[0][0],words[0][1],words[0][2]
				{"사과","호랑이","병원"}          //words[1][0],words[1][1],words[1][2],   
		};
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words[0].length;i++) {
			System.out.printf("%s의 뜻은? ",words[0][i]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[1][i])) {
				System.out.println("정답입니다.");
				
			}else {
				System.out.println("틀렸습니다. 정답은 "+words[1][i]+"입니다.");
			}
		}
	}
}

