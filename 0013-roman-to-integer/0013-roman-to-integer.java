class Solution {
    
    private int romanDigitToInt(char digit) {
        switch (digit) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    
    public int romanToInt(String s) {
        int previous = 0;
        int result = 0;
        for (char c : s.toCharArray()) {
            int current = romanDigitToInt(c);
            if (previous != 0 && previous < current) {
                result += current - (previous * 2);
                previous = 0;
                continue;
            }
            result += current;
            previous = current;
        }
        return result;
    }
}