class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m - 1, second = n - 1, index = m + n - 1;

        while (first >= 0 && second >= 0) {
            if (nums1[first] > nums2[second]) {
                nums1[index] = nums1[first];
                first--;
            } else {
                nums1[index] = nums2[second];
                second--;
            }
            index--;
        }

        while (second >= 0) {
            nums1[index] = nums2[second];
            second--;
            index--;
        }
    }
}