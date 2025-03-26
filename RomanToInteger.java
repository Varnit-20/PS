/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int total =0;
        int prevValue =0;
        
        for (int i = s.length() - 1 ; i >= 0 ; i-- ){
            int currentValue = getValue(s.charAt(i));
            
                        if( currentValue < prevValue)
                        
                        {
                            total = total - currentValue;
                        }
            
                        else
                        {
                            total = total + currentValue;
                        }
            
                        prevValue = currentValue;
                    }
                    return total;
                }
            
                private int getValue(char c)
                 {
                    switch (c) {
                        case 'I': return 1;
                        case 'V': return 5;
                        case 'X': return 10;
                        case 'L': return 50;
                        case 'C': return 100;
                        case 'D': return 500;
                        case 'M': return 1000;
                        default:
                            return 0;
                    }
                }
}
// @lc code=end


// public class RomanToInteger {
//     public static int romanToInt(String s) {
//         int total = 0;
//         int prevValue = 0;
        
//         for (int i = s.length() - 1; i >= 0; i--) {
//             int currentValue = getValue(s.charAt(i));

//             if (currentValue < prevValue) {
//                 total -= currentValue; // Subtract if smaller than previous value
//             } else {
//                 total += currentValue; // Otherwise, add to total
//             }
            
//             prevValue = currentValue;
//         }
        
//         return total;
//     }

//     private static int getValue(char c) {
//         switch (c) {
//             case 'I': return 1;
//             case 'V': return 5;
//             case 'X': return 10;
//             case 'L': return 50;
//             case 'C': return 100;
//             case 'D': return 500;
//             case 'M': return 1000;
//             default: return 0; // Should never reach here for valid input
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println(romanToInt("III"));      // Output: 3
//         System.out.println(romanToInt("LVIII"));    // Output: 58
//         System.out.println(romanToInt("MCMXCIV"));  // Output: 1994
//     }
// }
