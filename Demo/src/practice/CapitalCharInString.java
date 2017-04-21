package practice;

public class CapitalCharInString {
	static int count = 0, res;
	
	//using isUpperCase
	static int getCapitalChar(String s){
		char[] ar = s.toCharArray();
		for(char c : ar){
			if(Character.isUpperCase(c)){
				count++;
			}
		}
		return count;		
	}
	 
	//using ASCII values A-Z(65-90) a-z(97-122)
	static int getCapitalCharUsingASCII(String s){
		char[] ar = s.toCharArray();
		for(char c : ar){
			if((int) c >=65 && (int)c <=90){
				count++;
			}
		}
		return count;
		
	}
	
	//Check for capital words and replace with manoj
	static int splitReplace(String s){
		String[] str = s.split(" ");
		for(String c : str){
			if(c.equals(c.toUpperCase())){
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//res = CapitalCharInString.getCapitalChar("I am Good BOY. Hello World. GOD is Great");
		res = CapitalCharInString.splitReplace("I am Good BOY. Hello World. GOD is Great");
		System.out.println(res);

	}

}
