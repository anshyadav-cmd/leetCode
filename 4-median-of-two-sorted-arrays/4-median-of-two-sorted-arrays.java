class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int[] merge = new int[nums1.length+ nums2.length];
       System.arraycopy(nums1,0,merge,0,nums1.length);
       System.arraycopy(nums2,0,merge,nums1.length, nums2.length);
       Arrays.sort(merge);
       int size = merge.length;
       if(size % 2 == 0) {
           return (merge[size / 2] + merge[(size/2)-1])/2.0;
       }
       return merge[(int)size/2];
    }
}