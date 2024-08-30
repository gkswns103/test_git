package ex2_multi_array;

import java.util.Scanner;

public class Ex9_multi_array {
	public static void main(String[] args) {

		// 학생들의 수학 영어성적을 등록하는 프로그램
		// 몇명의 정보를 저장할 것인지를 입력받고
		// 그 수 만큼 학생들의 이름과 수학 영어 성적을 입력

		Scanner sc = new Scanner(System.in);
		System.out.print("등록인원 : ");
		int stu = sc.nextInt();
		String student[][] = new String[stu][3];
		for(int i =0; i < student.length; i++) {
			for(int j = 0; j < student[i].length;) {
				System.out.print("이름: ");
				student[i][j++] = sc.next();
				System.out.print("수학 : ");
				student[i][j++] = sc.next();
				System.out.print("영어 : ");
				student[i][j++] = sc.next();
				System.out.println("--------");
			}
		}
		System.out.printf("%d명 등록 성공\n",stu);
		for(int l =0; l < student.length; l++) {
			for(int k =0; k < student[l].length;) {
				System.out.printf("이름: %s ",student[l][k++]);
				System.out.printf("수학: %s ",student[l][k++]);
				System.out.printf("영어: %s \n",student[l][k++]);
			}
		}
	}
}