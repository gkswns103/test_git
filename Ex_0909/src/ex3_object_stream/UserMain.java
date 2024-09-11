package ex3_object_stream;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		User user = new User();
		Scanner sc = new Scanner(System.in);

		System.out.println("1.새로 등록");
		System.out.println("2.불러 오기");
		System.out.print(">> ");
		int select = sc.nextInt();
		InfoWriter iw = new InfoWriter();

		switch (select) {

		case 1:
			System.out.print("이름 : ");
			user.setName(sc.next());

			System.out.print("나이 : ");
			user.setAge(sc.nextInt());

			System.out.print("번호 : ");
			user.setTell(sc.next());

			// 유저 정보저장을 위한 클래스
			iw.setWriteInfo(user);

			break;
		case 2:
			System.out.print("번호 : ");
			InfoLoader il = new InfoLoader();
			user = il.loaderInfo(sc.next());

			if(user != null) {
				System.out.println("이름 : " + user.getName());
				System.out.println("나이 : " + user.getAge());
				System.out.println("번호 : " + user.getTell());
			}
			break;
		}
	}

}
