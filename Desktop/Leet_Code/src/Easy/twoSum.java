package Easy;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
	
	 public static int[] twoSum(int[] nums, int target) {
		 
		 HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		 for(int i = 0;i < nums.length;++i){
			 int dd = target - nums[i];
			 if(map.containsKey(dd)){
				 System.out.println(Arrays.toString(new int[]{map.get(dd),i}));
				 return new int[]{map.get(dd),i};
			 }
			 
			 map.put(nums[i], i);
			
		 }
		 throw new IllegalArgumentException("No two sum solution"); 
		// return 
	    }
	 
	 
	 
	 public static void main(String[] args) {
		   int[] arr1 = {1,2,3,4,8};
	         System.out.println(twoSum(arr1, 7));
		 
		      /*     HashMap<String, Integer> map=new HashMap<String, Integer>();
		         map.put("DEMO", 1);
		         map.put("1", 11);
		         map.put("1", 111);*/
		              /* System.out.println(map.get("1"));//null
		                System.out.println(map.get("DEMO"));//1
		                System.out.println(map.values());
		                System.out.println(map.keySet());*/
		       }
}
