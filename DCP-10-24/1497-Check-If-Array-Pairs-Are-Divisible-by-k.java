class Solution {
    public boolean canArrange(int[] arr, int k) {
        // Keeping track of all the mod values encountered
        int[] modFreq = new int[k];

        for (int num : arr) {
            // Calculating remainder and correcting it if negative
            int correctedRem = (num % k + k) % k;

            // Updating the mod frequency
            modFreq[correctedRem]++;
        }

        // Check if remainder 0 can form pairs (its frequency must be even)
        if (modFreq[0] % 2 != 0) {
            return false;
        }

        // Check if other remainder pairs (i, k-i) have equal frequencies
        for (int i = 1; i <= k / 2; i++) {
            if (modFreq[i] != modFreq[k - i]) {
                return false;
            }
        }

        // If all conditions are satisfied, return true
        return true;
    }
}