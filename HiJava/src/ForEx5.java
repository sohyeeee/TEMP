
public class ForEx5 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
		System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++){
				if(j==i) {
					System.out.print(1);
					
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

}
