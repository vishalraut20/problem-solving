package array;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int i = 1;
        int currentElementIndex = 0;
        while(i<nums.length){
            if(nums[i] != nums[currentElementIndex]){
                nums[++currentElementIndex] = nums[i];
            }
            i++;
        }
        return currentElementIndex+1;
    }
}
