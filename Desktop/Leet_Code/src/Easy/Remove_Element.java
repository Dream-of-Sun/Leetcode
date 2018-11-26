package Easy;

public class Remove_Element {
	public int removeElement(int[] nums, int val) {
		 int j ,i=0;
			if(nums.length == 0){return 0;}
			else{
				for(j=0;j<nums.length;j++){
					if(nums[j] != val){
						nums[i] = nums[j];
	                    i++;
					}
				}
				 return i;
			}
    
	}
}
