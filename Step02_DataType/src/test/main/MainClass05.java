package test.main;
/*
 * [Java 참조 데이터 type]
 * 
 * String type
 * 
 * - 문자열을 다룰때 사용하는 데이터 type이다.
 * - double quotation으로 감싼다.
 * - id값을 가지고다니는 참조 데이터 type이다.
 */

public class MainClass05 {
	public static void main(String[] ar) {
		System.out.println("main 메서드가 시작 되었습니다.");
		
		//"김구라" 정보를 담고있는 참조값(id값)이 변수에 들어간다.
		String name="김구라";
		String tmp=name; //참조값 복사해 주기
		name="원숭이"; //새로운 참조값으로 대입하기
		
		name=null;//name 변수를 empty(빈) 상태로 만들기
		name="";
	}
}
