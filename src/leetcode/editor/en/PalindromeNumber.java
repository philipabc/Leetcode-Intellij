//Determine whether an integer is a palindrome. An integer is a palindrome when 
//it reads the same backward as forward. 
//
// Example 1: 
//
// 
//Input: 121
//Output: true
// 
//
// Example 2: 
//
// 
//Input: -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes
// 121-. Therefore it is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
// 
//
// Follow up: 
//
// Coud you solve it without converting the integer to a string? 
// Related Topics Math


package leetcode.editor.en;
public class PalindromeNumber {
    public static void main(String[] age) {
        Solution solution = new PalindromeNumber().new Solution();
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 10 && x >= 0) return true;
        if (x % 10 == 0) return false;
        int a = 0;
        while (a < x) {
            a = a * 10 + x % 10;
            x = x / 10;
        }
        return (a == x || x != 0 && a / 10 == x) ? true : false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}