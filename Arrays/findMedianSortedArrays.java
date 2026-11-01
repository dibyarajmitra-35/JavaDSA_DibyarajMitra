class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
     if(nums1.length > nums2.length)
     {
        return findMedianSortedArrays(nums2, nums1);

     }

        int m = nums1.length;
        int n = nums2.length;

        int total = m + n;
        int h = (total + 1) / 2;

        int left = 0;
        int right =  m;


        while(left <= right)
        {
            int p1 = left + (right - left) / 2;
            int p2 = h - p1;

            int maxLeft1 = (p1 == 0) ? Integer.MIN_VALUE : nums1[p1 - 1];
            int minRight1 = (p1 == m) ? Integer.MAX_VALUE : nums1[p1];

            int maxLeft2 = (p2 == 0) ? Integer.MIN_VALUE : nums2[p2 - 1];
            int minRight2 = (p2 == n) ? Integer.MAX_VALUE : nums2[p2];        
            

            if(maxLeft1 <= minRight2 && maxLeft2 <= minRight1)
            {
                if(total % 2 == 0)
                {
                    return(Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;

                }

                else
                {
                    return Math.max(maxLeft1, maxLeft2);
                }

            }

                else if(maxLeft1 > minRight2)
                {
                  right = p1 - 1;
                }

                else
                {
                  left = p1 + 1;
                }
            
        }

        return 0.0;
        
    }
}