class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        List<Integer> sortedMergeNums =  new ArrayList<>() ;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) {
                sortedMergeNums.add(nums1[i]);
                i++;
            }else {
                sortedMergeNums.add(nums2[j]);
                j++;
            }
        }
        while(i < nums1.length) {
            sortedMergeNums.add(nums1[i]);
            i++;
        }
        while(j < nums2.length){
            sortedMergeNums.add(nums2[j]);
            j++;
        }
        int size = sortedMergeNums.size();
        return size % 2 == 0 ? ((sortedMergeNums.get(size/2))+(sortedMergeNums.get((size/2)-1))) / 2.0 : sortedMergeNums.get((int)Math.floor(size/2));
    }
}