class solution {
    public int maxArea(int[] height){
        int maxarea = 0;
        for(int i = 0; i < height.length;i ++){
            for(int j = i + 1; j < height.length; j++){
                maxarea = Math.max(maxarea, (j-i)*Math.min(height[i], height[j]));
            }
        }
        return maxarea;
    }
    public static void main(String args[]){
        int[] height = {1,8,6,2,5,4,8,3,7};
        solution s = new solution();
        int a = s.maxArea(height);
        System.out.println(a);
    }
}
/*
public class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
 */