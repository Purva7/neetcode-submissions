class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(c);
        int i = 0;
        int j = c.length() - 1;

        while (i < j) {
            char left = c.charAt(i);
            char right = c.charAt(j);
            System.out.println(left +" "+right);
            if (left != right) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
