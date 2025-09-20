class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        d = {}
        for i in range(len(s)):
            if(s[i] in d):
                d[s[i]] = d[s[i]] + 1
            else:
                d[s[i]] = 1
        
        sum = 0
        odd = 0
        for x in d:
            sum = sum + d[x]

            if(d[x] % 2 != 0):
                sum = sum - 1
                odd = 1
        
        return(sum + odd)
        
