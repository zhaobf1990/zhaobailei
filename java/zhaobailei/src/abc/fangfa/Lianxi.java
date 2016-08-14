package fangfa;

public class Lianxi {
	public static void main(String[] args){
		String a = "asdfghjkl123456789ASDFGHJKL";
		
		int b=a.length();
		int q=0;
		int w = 0;
		int e=0;
		for(int i = 0;i<b;i++){
			char c = a.charAt(i);
			if(c>'a'&&c<'z'){
				q++;
			}else if(c>'A'&&c<'Z'){
				w++;
			}else{
				e++;
			}
			
		}
		System.out.println(q +" "+w+" "+e+" ");
	}

}
