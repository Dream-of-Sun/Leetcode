package Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse_Interger {
	 public int reverse(int x) {
	       int rev = 0;
	        while (x != 0) {
	            int pop = x % 10;
	            x /= 10;
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
	            rev = rev * 10 + pop;
	        }
	        return rev;
	    }
	/* public int reverse(int x) {
		 char[] aa = bb(x);
		 x = cc(aa);
		 System.out.println(x);
		 return x;
	    }
	 
	 
	 public char[] bb(int x){
		 System.out.println(x);
		String str = String.valueOf(x);
		char dd[] = new char[str.length()];
		for(int i = 0;i<str.length();++i){
			char ch = str.charAt(i); 
			dd[i] = ch;
			System.out.println(dd[i]);
		}
		 return dd;
	 }
	 
	 public int cc(char[] aa){
		 System.out.println(aa);
		 int x=0,i=0,j=aa.length-1,m=0,n=0,l=0;
		 char temp;
		 while(i<=j){
			 if(aa[i]>= 48 && aa[i]<=57){
				 System.out.println("3333");
				 
				 
				if(aa[j]!=48){
					temp = aa[i];
					aa[i] = aa[j];
					aa[j] = temp;
					j--;
					i++;
				}else{
					j--;
				}
			 }else{
				 i++;
			 }	 
		 } 
		 System.out.println(aa);
		 while(m<aa.length){
			 if(aa[m]!=48){
				 System.out.println(m); 
				 l = m;
				 System.out.println(l + "ffffff"); 
				 m++;
				 }else{m++;}
				
			 } 
		 char[] ff = new char[l];
		 char[] ee = new char[aa.length-l];
		 for(n=0;n<aa.length;n++){
			if(n<=m){ff[n] = aa[n];}
			else{ee[n-l] = aa[n];}
		 }
		 System.out.println(ff);
		 x = Integer.parseInt(String.valueOf(ff));
		 return x; 
	 }
	 
	 public static void main(String[] args) { 
		 Reverse_Interger RI = new Reverse_Interger();
		 System.out.println(RI.reverse(-7234000));
		 System.out.println("aaaaa");
	 }*/
	        	 
}
