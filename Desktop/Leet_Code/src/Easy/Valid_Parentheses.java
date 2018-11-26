package Easy;

import java.util.HashMap;
import java.util.Stack;

public class Valid_Parentheses {
	 //Stack<String> stack;
	/* public boolean isValid(String s) {
	  Stack<Character> stack = new Stack<Character>();
      char[] chars = s.toCharArray();
      for (char aChar : chars) {
          if (stack.size() == 0) {
              stack.push(aChar);
          } else if (isSym(stack.peek(), aChar)) {
              stack.pop();
          } else {
              stack.push(aChar);
          }
      }
      return stack.size() == 0;
      
  }*/
	 /*private boolean isSym(char c1, char c2) {
    return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
}*/
	 private HashMap<Character, Character> mappings;

	  // Initialize hash map with mappings. This simply makes the code easier to read.
	  public Valid_Parentheses() {
	    this.mappings = new HashMap<Character, Character>();
	    this.mappings.put(')', '(');
	    this.mappings.put('}', '{');
	    this.mappings.put(']', '[');
	  }

	  public boolean isValid(String s) {

	    // Initialize a stack to be used in the algorithm.
	    Stack<Character> stack = new Stack<Character>();

	    for (int i = 0; i < s.length(); i++) {
	      char c = s.charAt(i);

	      // If the current character is a closing bracket.
	      if (this.mappings.containsKey(c)) {

	        // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
	        char topElement = stack.empty() ? '#' : stack.pop();

	        // If the mapping for this bracket doesn't match the stack's top element, return false.
	        if (topElement != this.mappings.get(c)) {
	          return false;
	        }
	      } else {
	        // If it was an opening bracket, push to the stack.
	        stack.push(c);
	      }
	    }

	    // If the stack still contains elements, then it is an invalid expression.
	    return stack.isEmpty();
	  }
 
	 public static void main(String[] args){
		 Valid_Parentheses vp = new Valid_Parentheses();
		 System.out.println(vp.isValid("{}()["));
		// System.out.println("{".equals("}"));
	 }
}
