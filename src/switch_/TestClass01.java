package switch_;

public class TestClass01 {

	public static void main(String[] args) {
	/*
	 switch(식) {
	 	case 1: 내용; break;
	 	case 2: 내용; break;
	 	...
	 	default : 내용;
	 }
	 */

		int select = 2;
		switch (select) {
		case 1 : System.out.println("1.입력"); break;
		case 2 : System.out.println("2.입력"); break;
		default : System.out.println("1,2 제외한 다른값");
		}
		System.out.println("다음 문장들 실행!");
		//break가 없으면 그 이후 문장들도 같이 실행됨
	}

}
