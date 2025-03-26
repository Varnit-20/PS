/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        int count =0;
        for(int i = 0 ; i <= l ; i ++ ){
            if ( nums[i] == nums[i+1] ) {
                count ++;
            }
        }
        return count;
        
    }
}
// @lc code=end

