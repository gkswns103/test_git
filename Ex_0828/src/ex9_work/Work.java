package ex9_work;

public class Work {
	
	char c[] = {'a','b','c','d','e','f','g','h','i','j',
				'k','l','m','n','o','p','q','r','s','t',
				'u','v','w','x','y','z','0','1','2','3',
				'4','5','6','7','8','9'};
	
	char ss[] = {'`','~','!','@','#','$','%','^','&','*',
				 '(',')','-','_','=','+','|','[',']','{',
				 '}',';',':',',','.','/','q','w','e','r',
				 't','y','u','i','o','p'};
	
	public String print(String s) {
		String str = ""; 
		for(int i =0; i < s.length(); i++) {
			for(int j=0; j < c.length; j++) {
				if(s.charAt(i) == c[j]) {
					str += ss[j];
				}
			}
		}
		return str;
	}
}

