class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }

        int ret = 0;
        int odd = 0;
        for(char c : map.keySet()){
            if(map.get(c) % 2 == 0){
                ret = ret + map.get(c);
            }
            else{
                ret = ret + (map.get(c) - 1);
                odd = 1;
            }
        }
        return(ret + odd);
    }
}
