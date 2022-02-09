/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {

    public boolean isPalindrome(int x) {
        // 负数不是回文数
        if(x < 0) 
            return false;
        int num = 0;
        while(x != 0) {
            num = num * 10 + x % 10;
            if(num >= x) {
                break;
            }
            x = x / 10;
        }
        System.out.println("num is " + num);
        System.out.println("x is " + x);


        return num == x;
    }

    public static void main(String[] args) {
        Integer num = 121;
        Solution solution = new Solution();
        boolean isPalindrome = solution.isPalindrome(num);
        System.out.println("is " + num + "palindrome? " + isPalindrome);
    }
}
// @lc code=end

