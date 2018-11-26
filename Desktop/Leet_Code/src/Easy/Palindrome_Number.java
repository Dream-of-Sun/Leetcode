package Easy;

public class Palindrome_Number {

	public boolean isPalindrome(int x) {
		  int  rev=0,m=x;
			while(x!=0){
			int pop = x%10;
			x/= 10;
			rev = rev*10+pop;
			}
			if(m<0){return false;}
			else if(m == 0 || m == rev){return true;}
			else{
				return false;
			}
    }
	 public static void main(String[] args) { 
		 Palindrome_Number RI = new Palindrome_Number();
		 System.out.println(RI.isPalindrome(-51215));
		 System.out.println("aaaaa");
	 }
}
