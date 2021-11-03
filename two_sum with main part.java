import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target){
        int i,j;
        for(i=0; i< nums.length; i++){
            for(j = i + 1; j < nums.length; j++){
                if(nums[j] == target - nums[i]){
                    int a[] = {i, j};
                    return a;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println("Given nums="+Arrays.toString(nums)+",target="+target);
        Solution s=new Solution();
        int [] a=s.twoSum(nums, target);
        int i=a[0];int j=a[1];
        System.out.println("Because nums["+i+"]+nums["+j+"]="+nums[i]+"+"+nums[j]+"="+target);
        System.out.println("return ["+i+","+j+"]");
    }
}