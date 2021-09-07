//NC92 最长公共子序列-II
//给定两个字符串str1和str2，输出两个字符串的最长公共子序列。
//如果最长公共子序列为空，则返回"-1"。目前给出的数据，仅仅会存在一个最长的公共子序列
import java.util.*;
public class Solution {
    /**
     * longest common subsequence
     * @param s1 string字符串 the string
     * @param s2 string字符串 the string
     * @return string字符串
     */
    public String LCS (String s1, String s2) {
        // write code here
        String[][] dp = new String[s1.length()+1][s2.length()+1];
        
        for(int i = 0; i <= s1.length(); i++){
            for(int j = 0; j <= s2.length(); j++){
                if(i == 0 || j == 0){
                    dp[i][j] = "";
                }
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+s1.charAt(i-1);
                }else{
                    dp[i][j] = dp[i-1][j].length() > dp[i][j-1].length() ? dp[i-1][j]:dp[i][j-1];
                }
            }
        }
        if(dp[s1.length()][s2.length()] == "")    return "-1";
        return dp[s1.length()][s2.length()];
    }
}