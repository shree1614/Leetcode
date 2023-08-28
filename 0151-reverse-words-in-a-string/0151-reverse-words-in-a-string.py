class Solution:
    def reverseWords(self, s: str) -> str:
        
        s=s.split();s=s[::-1];p=" ".join(s);return str(p)