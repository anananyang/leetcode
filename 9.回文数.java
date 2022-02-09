/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {

    public boolean isPalindrome(int x) {
        // 负数不是回文数, 并且末位为 0 也不是回文数，因为第一位（从左向右）无法为 0
        if(x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int y = 0;
        while(y < x) {
            y = y * 10 + x % 10;
            x = x / 10;        
        }
        // 如果x长度为偶数位，应该相等
        // 如果x长度为奇数位，因为 x 已经除以10了，所以应该和 y 除以10相等
        return y == x || y / 10 == x;
    }
}
// @lc code=end

