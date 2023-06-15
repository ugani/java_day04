package switch_;

import java.util.Scanner;

public class TestClass05 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
//		 int num = 0;
//		 int s = 0;
//		  while(true) {
//			  System.out.print("수 입력:");
//			  num = sc.nextInt();
//			  s = num % 7;
//			  switch(s){
//				  case 1 : System.out.println(num+":월요일");
//				  break;
//				  case 2 : System.out.println(num+":화요일");
//				  break;
//				  case 3 : System.out.println(num+":수요일");
//				  break;
//				  case 4 : System.out.println(num+":목요일");
//				  break;
//				  case 5 : System.out.println(num+":금요일");
//				  break;
//				  case 6 : System.out.println(num+":토요일");
//				  break;
//				  case 0 : System.out.println(num+":일요일");
//				  break;
//				  default : System.out.println(":잘못입력");
//			  }
//		  }
		 
		 String home = null, of = null;
		 int num7;
		 while(true) {
			 System.out.println("1. 우리집 등록");
			 System.out.println("2. 회사 등록");
			 System.out.println("3. 등록 보기");
			 System.out.print("고르시오 :");
			 num7 = sc.nextInt();
			 System.out.println();
			 switch(num7){
			 case 1 : System.out.println("1. 우리집 등록");
			 System.out.print("등록 할 주소 입력:");
			 home = sc.next(); 
			 System.out.println();
			 break;
			 case 2 : System.out.println("2. 회사 등록");
			 System.out.print("등록 할 주소 입력:");
			 of = sc.next(); 
			 System.out.println();
			 break;
			 case 3 : System.out.println("3. 등록 보기");
			 System.out.println("우리집  : " +home+ "\n회사 : "+of);	 
			 System.out.println();
			 break;
			 default : System.out.println("잘못입력함");
			 System.out.println();
			 }
		 }
		 
		 
		 

	}

}
