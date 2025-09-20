public class Solution {
    public int LongestPalindrome(string s) {
        Dictionary<char, int> d = new Dictionary<char, int>();
        for(int i = 0; i < s.Length; i++){
            if(!d.ContainsKey(s[i])){
                d[s[i]] = 1;
            }
            else{
                d[s[i]] = d[s[i]] + 1;
            }
        }

        int sum = 0;
        int odd = 0;
        foreach(char x in d.Keys){
            sum = sum + d[x];
            if(d[x] % 2 != 0){
                sum--;
                odd = 1;
            }
        }
        return(sum + odd);
    }
}
