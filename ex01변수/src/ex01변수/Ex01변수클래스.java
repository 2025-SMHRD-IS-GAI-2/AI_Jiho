package ex01변수;

import java.util.Scanner;

public class Ex01변수클래스 {

	public static void main(String[] args) {
	//asdf
		// TODO Auto-generated method stub
    // 주석 : 실행하는 코드가 아닌 메모 작성용
	// Java에서의 영역
	// : 중괄호 한 쌍 중에서 열리는 중괄호부터
	//   닫히는 중괄호를 만나기 전까지의 부분
	// - 클래스 생성시, 첫 번째 체크박스=main
    //   메인 안 쪽{}에 코드를 작성한다.
    // - 저장하는 단축키 ctrl+s
	// - 실행하는 단축키 ctrl+f11
	// - 글자 키우는 단축키 : ctrl+shift++
	// - 글자 줄이는 단축키 : ctrl+shift+-
	// - 코드 한 줄 작성이 끝나면 ;붙이기
	// - 결과창 : 콘솔창
	// - 출력하고 싶은 텍스트는 ()안에 넣기
    // syso 작성 후, ctrl+space
	// print : 개행x, println : 개행o
	// 입력을 해보자(콘솔창을 통해서 입력 받기)
	// 1. 입력받게 해주는 도구 Scanner 가져오기
	//    S대문자 주의, ctrl+space해서 import
	// 2. 우리가 붙여준 이름 sc를 호출해서 입력받기
	// 출력문 println 다음에 입력 받으면 개행되서 입력됨
	// sc.next() : 문자를 입력받는 기능(행위)
	// sc.nextInt() : 정수를 입력 받는 기능(행위)
	// = 더 이상 같다라는 의미 X,
	// =을 기준으로 오른쪽의 데이터를 왼쪽에 넣는다
	// 정수를 영어로 integer
	System.out.println("Hello world!");
    System.out.println("자동완성 단축키");
    System.out.println("이번에는 될까?");
    Scanner sc = new Scanner(System.in);
    System.out.print("나이를 입력해주세요 >> ");
    int box=sc.nextInt();
    System.out.println(box);
	}

}
