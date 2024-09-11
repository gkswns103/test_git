package ex3_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkMain {

	public static void main(String[] args) {
		// ArrayList를 활용하여
		// 고객의 인적사항을 추가 삭제 조회하는 코드를 작성
		// -----------------
		// 1.정보추가
		// 2.정보삭제
		// 3.전체정보
		// etc.종 료
		// >> 1
		// 이름: hong
		// 나이: 20
		// 전화번호: 010-111-2222
		// 정보 저장 성공
		// 1.정보추가
		// 2.정보삭제
		// 3.전체정보
		// etc.종 료
		// >> 3
		// --전체정보--
		// 등록인원 : 1명
		// hong / 20 / 010-111-2222
		// 삭제 이름으로 구별해서 삭제
		Scanner sc = new Scanner(System.in);
		List<Work> list = new ArrayList<Work>();
		int num = 0;
		Work w = new Work();
		w:while(num <= 3) {
			w.showMenu();
			num = sc.nextInt();
			switch(num) {
			case 1:
				w = new Work();
				System.out.print("이름 : ");
				w.setName(sc.next());
				System.out.print("나이 : ");
				w.setAge(sc.nextInt());
				System.out.print("전화번호 : ");
				w.setTell(sc.next());
				list.add(w);
				System.out.println("정보 저장 성공");
				break;
			case 2:
				System.out.print("삭제할 인원의 이름 : ");
				String deleteName = sc.next();
				w = new Work();
				for(int i=0; i<list.size(); i++) {
					if(list.get(i).getName().equals(deleteName)) {
						list.remove(i);
						System.out.println(deleteName + "회원 삭제완료");
						continue w;
					}
					else {
						System.out.println("해당 회원이 없습니다.");
						continue w;
					}
				}
			case 3:
				if(list.size() == 0) {
					System.out.println("저장된 회원이없습니다");
					break;
				}
				System.out.println("--전체정보--");
				for(int i =0; i<list.size(); i++) {
					System.out.println(list.get(i).getName() + " / " + list.get(i).getAge() + " / " + list.get(i).getTell());
				}
				break;
			}
		}
	}

}
