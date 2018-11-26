package Easy;

import java.awt.List;

public class Merge_Two_Sorted_Lists {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		/* ListNode head = new ListNode(0);
		 ListNode p = head;
		    while(l1 != null || l2!= null){
		    	if(l1 != null && l2!= null ){
		    		if(l1.val < l2.val){
		    			p.next = l1;
		    			l1 = l1.next;
		    		}else{
		    			p.next = l2;
		    			l2 = l2.next;
		    		}
		    		p = p.next;
		    	}else if(l1 == null){
		    		p.next = l2;
		    	}else if(l2 == null){
		    		p.next = l1;
		    	}
		    }
		 return head.next;*/
		 if(l1 == null) return l2;
	        if(l2 == null) return l1;
	        if(l1.val < l2.val){
	            l1.next = mergeTwoLists(l1.next, l2);
	            System.out.println(l1.val);
	            return l1;
	        } else{
	            l2.next = mergeTwoLists(l1, l2.next);
	            return l2;
	        }
	    }
	 
	 public static void main(String[] args) {
	 }
}
