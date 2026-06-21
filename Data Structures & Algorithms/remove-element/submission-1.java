class Solution {
    public int removeElement(int[] nums, int val) { // Must be 'int' to match Main.java
        int k = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Shifts valid numbers to the front of the original array
                k++;
            }
        }
        
        return k; // Returns the integer count, fixing the compilation mismatch
    }
}