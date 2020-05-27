package test.main;

public class MainClass06 {
	public static void main(String[] ar) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//int type 지역변수를 선언만 하면 만들어지지 않는다.
		int num1;
		//String type 지역변수를 선언만 하면 만들어지지 않는다.
		String name1;
		
		//아직 만들어지지 않았기 때문에 num1은 참조불가
		//int result=10+num1;
		
		System.out.println("main 메소드가 종료 됩니다.");
	}

}
