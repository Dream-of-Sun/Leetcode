package Easy;

// ˫ָ�뷨
public class Remove_Duplicates_from_Sorted_Array {
	 public int removeDuplicates(int[] nums) {
		 int i=0,j;
	     if(nums.length == 0){return 0;}
	     else{
	     for(j=1;j<nums.length;j++){
	    	 if(nums[j]!=nums[i]){ 
                 i++;
                 nums[i] = nums[j];   
	    	 }
	     }
		 return i+1;
	    }
	 }
}
