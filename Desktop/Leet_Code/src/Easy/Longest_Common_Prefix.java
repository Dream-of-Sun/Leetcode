package Easy;

import java.util.Arrays;

public class Longest_Common_Prefix {

	public String longestCommonPrefix(String[] strs) {
		 if (strs == null || strs.length == 0) return "";
	        String res = new String();
	        for (int j = 0; j < strs[0].length(); ++j) {
	            char c = strs[0].charAt(j);
	            for (int i = 1; i < strs.length; ++i) {
	                if (j >= strs[i].length() || strs[i].charAt(j) != c) {
	                    return res;
	                }
	            }
	            res += Character.toString(c);
	        }
	        return res;
	}

	public static void main(String[] args) {
		Longest_Common_Prefix lcp = new Longest_Common_Prefix();
		System.out.println("3333");
		// String[] s = new String[]{"flower","flow","flight"};
		String[] s = { "aaa","aa","aaa" };
		System.out.println(lcp.longestCommonPrefix(s));
	}
}
