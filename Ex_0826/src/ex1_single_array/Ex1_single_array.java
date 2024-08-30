package ex1_single_array;

import java.util.Scanner;

public class Ex1_single_array {
	public static void main(String[] args) {
		
		// 학생들의 성적을 입력받고 평균성적 이상인 학생들의 수와
		// 평균 이상인 학생들의 번호를 출력
		// ------------
		// 학생수 : 3
		// 학생1: 90
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수: ");
		int stu_su = sc.nextInt();
		int stu[] = new int[stu_su];
		float sum =0;
		int cnt =0;
		for(int i=0; i < stu_su; i++) {
			System.out.printf("학생%d: ",i+1);
			stu[i] = sc.nextInt();
			sum += stu[i];
		}
		System.out.printf("평균성적 : %.1f\n",(float)sum/stu_su);
		System.out.println("---평균성적 이상인 학생들---");
		for(int j =0; j < stu_su; j++) {
			if(stu[j] > (float)sum/stu_su) {
				System.out.printf("=> 학생%d\n",j+1);
				cnt++;
			}
		}
		System.out.println("평균 이상 학생의 수 :" + cnt);
	}
}
