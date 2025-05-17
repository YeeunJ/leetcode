class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int p1=0, p2=0;
        List<Integer> result = new LinkedList<>();

        while(p1 < len1 && p2 < len2) {
            if(nums1[p1] > nums2[p2]) {
                p2++;
            }else if(nums1[p1] == nums2[p2]) {
                result.add(nums1[p1]);
                p1++;
                p2++;
            }else {
                p1++;
            }
        }
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}