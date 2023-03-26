

public class ForEx6 {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****
		//******
		//*******
		//********
		//*********
		//**********  
		//위의 모양 출력하기
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//**********
		//*********
		//********
		//*******
		//******
		//*****
		//****
		//***
		//**
		//*
		//위의 모양 출력하기
		for(int i=10;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		**********
//		 *********
//		  ********
//		   *******
//		    ******
//		     *****
//		      ****
//		       ***
//		        **
//		         *
		//위의 모양 출력하기
		for(int i=0; i<10;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int x=0;x<10-i;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//	        *
//	       ***
//	      *****
//	     *******
//	    *********
//	   ***********
//	  *************
//	 ***************
//  *****************
// *******************
//위의 모양 출력하기
		
		for(int i=0;i<10;i++) {
			for(int j=10;j>i;j--) {
				System.out.print(" ");
			}
			for(int x=0;x<(i*2)-1;x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
