package fangfa;

public class IInteger {

	/**
	 * @param args
	 * public Integer(int Value);
	 * public Integer(String s);
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 100;
		Integer ii = new Integer(i);
		System.out.println(ii);
		
		String s = "100";
		Integer iii = new Integer(s);
		System.out.println(iii);
	}

}
