class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = c.length() - 1;

        while (i < j) {
            char left = c.charAt(i);
            char right = c.charAt(j);
            if (left != right) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
