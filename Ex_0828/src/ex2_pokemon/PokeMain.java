package ex2_pokemon;

import java.util.Scanner;

public class PokeMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Monster m1 = new Monster();
		System.out.print("이름: ");
		m1.name = sc.next();
		System.out.print("타입: ");
		m1.type = sc.next();		
		m1.myPokemon();
		
		Monster m2 = new Monster();
		System.out.print("이름: ");
		m2.name = sc.next();
		System.out.print("타입: ");
		m2.type = sc.next();
		m2.myPokemon();
		
		Monster m3 = new Monster();
		System.out.print("이름: ");
		m3.name = sc.next();
		System.out.print("타입: ");
		m3.type = sc.next();
		m3.myPokemon();
	}
}
