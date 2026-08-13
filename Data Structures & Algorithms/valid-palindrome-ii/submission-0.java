class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                int i = left + 1, j = right;
                while (i < j && s.charAt(i) == s.charAt(j)) {
                    i++;
                    j--;
                }
                if (i >= j) return true;

                i = left;
                j = right - 1;
                while (i < j && s.charAt(i) == s.charAt(j)) {
                    i++;
                    j--;
                }
                return i >= j;
            }
            left++;
            right--;
        }

        return true;
    }
}