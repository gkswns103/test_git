package work;

import java.util.Random;

public class SrpGame {

	String srp[] = {"s","r","p"};
	public String game(String s) {
		String r_srp = srp[new Random().nextInt(srp.length)];
		if(s.equals("s")) {
			if(r_srp.equals("r"))
				return "lose";
			else if(r_srp.equals("p"))
				return "win";
		}
		else if(s.equals("r")) {
			if(r_srp.equals("p"))
				return "lose";
			else if(r_srp.equals("s"))
				return "win";
		}
		else if(s.equals("p")) {
			if(r_srp.equals("s"))
				return "lose";
			else if(r_srp.equals("r"))
				return "win";
		}
		return "draw";
	}
}
