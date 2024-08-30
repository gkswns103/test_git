package ex4_operator;

public class Ex3_operater {
	public static void main(String[] args) {
		
		// 논리연산자 : 비교 연산자를 통한 연산이 두 개 이상 필요할 때 사용
		int age = 30;
		int limit = 35;
		boolean res = limit - age >=5 && age > 30;
		System.out.println(res);
		
		/*
		 * true && true = true
		 * else && -> false
		 * */
		
		int i1 = 10;
		int i2 = 20;
		boolean res2 = (i1 += 10) > 20 || i2 - 10 == 11;
		System.out.println(res2);
		
		res2 = !res2;
		System.out.println(res2);
		
		System.out.println("----------");
		
		
		// 즘감연산자
		int a = 10;
		System.out.println(++a);
		int b = 10;
		System.out.println(b++);
		
		
		
		
		b--;
		++b;
		b++;
		b--;
		--b;
		b++;
		++b;
		System.out.println(b);
		
		System.out.println("----------");
		
		// 삼항(조건)연산자
		// 하나의 조건을 정의하여 그 조건이 참일때와 거짓일때에 대해
		// 원하는 결과를 얻어내기 위해 사용하는 연산자
		
		int aa = 10;
		int bb = 15;
		res = ++aa >= bb ? true : false;
		System.out.println(res);
		
		aa = 10;
		bb = 20;
		char res3 = (aa += aa) == bb ? 'Y' : 'N';
		System.out.println(res3);
		
	}
}
