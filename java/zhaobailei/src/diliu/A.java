package diliu;

public class A {
	public static void main(String[] args){
		String s= "asdfghjklASDFGHJKLM!@#$%";
		int w =0,e = 0, r=0;
		for(int i = 1;i<s.length();i++){
			char c = s.charAt(i);
			if(c>='a'&&c<='z'){			
				w++;
			}else if(c>='A'&&c<='Z'){		
				e++;				
			}else{		
				r++;				
			}
		}
			System.out.print("a= "+w+" A= "+e+"#"+r);

	}		


}
