package ex3_work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;

public class HangManGame{

	Random r = new Random();
	Scanner sc = new Scanner(System.in);

	FileInputStream fis = null;
	FileOutputStream fos = null;
	BufferedInputStream bis = null;
	BufferedOutputStream bos = null;
	File f = new File("c:/IOtest/HangManGameProblem.txt");

	String p[] = {"apple","project"};
	String problem;
	String star[];
	String sstar;
	int cnt =0;
	public HangManGame() { // 생성자에서 문제 생성 및 문제길이와 같은 별 star에 추가
		problem = p[r.nextInt(p.length)];
		star = new String[problem.length()];
		for(int i=0; i<problem.length(); i++) {
			star[i] = "☆";
		}
	}

	public void printStar() {
		for(int i =0; i<star.length; i++) {
			System.out.print(star[i]);
		}
	}

	public void run() {
		sstar ="";
		for(int i =0; i<star.length; i++) {
			sstar += star[i];
		}
	}

	public void game() {
		System.out.println("***HANGMAN***");  
		w:while(true) {
			System.out.print("Word : ");
			printStar();
			System.out.print(" >> ");
			String str = sc.next(); // 문자
			cnt++;
			try {
				if(str.length() > 1 || Integer.parseInt(str) / 1 == Integer.parseInt(str)) {
					System.out.println("한글자의 영 소문자만 입력 가능합니다");
					continue w;
				}
			}catch(Exception e) {}
			for(int i=0; i<problem.length(); i++){
				String str2 = "" + problem.charAt(i);
				if(str.equals(str2)) { // 적은문자가 문제에 있는경우
					if(star[i].equals(str)) {// 이미 적었던 문제인경우
						System.out.println(str + "은 이미 입력한 문자입니다.");
						continue w;
					}
					star[i] = str2;
					for(int j=i+1; j<problem.length(); j++) {
						String str3 = "" + problem.charAt(j);
						if(str3.equals(str))
							star[j] = str;
					}
					run();
					System.out.println(sstar);
					if(sstar.equals(problem)) {
						break w;
					}
					continue w;
				}
			}
			System.out.println(str + "은 포함되지 않습니다.");
			continue w;
		}
		System.out.println(cnt + "번만에 정답!");
	}
}
