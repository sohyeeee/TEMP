public class J5_9 {
	public static void main(String[] args) {
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		int korTotal=0, engTotal=0, mathTotal=0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("==========================");
		
		for(int i = 0;i<score.length;i++) {
			System.out.printf("%d ",i+1);
			
			int sum = 0;  //개인별 국영수 총점
			float avg = 0.0f;  //개일별 평균
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			for(int j=0;j<score[i].length;j++) {
				System.out.printf("%3d ",score[i][j]);
				sum += score[i][j];
			}
			avg = sum /(float)score[i].length;
			System.out.printf("%3d %5.1f",sum,avg);
			
			System.out.println();
		}
		System.out.println("==========================");
		System.out.printf("총점 : %d %d %d",korTotal,engTotal,mathTotal);
	}			
}
