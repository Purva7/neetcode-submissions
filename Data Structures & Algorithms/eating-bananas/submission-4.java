class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // Find biggest pile
        for (int pile : piles) {
            right = Math.max(right, pile);
            System.out.println("right "+right);
        }

        while (left < right) {
            int speed = left + (right - left) / 2;

            long hours = 0;

            // Calculate hours needed at this speed
            for (int pile : piles) {
                hours += (pile + speed - 1) / speed;
            }

            if (hours <= h) {
                // speed works, try smaller
                right = speed;
            } else {
                // too slow, need faster speed
                left = speed + 1;
            }
        }

        return left;
    }
}
