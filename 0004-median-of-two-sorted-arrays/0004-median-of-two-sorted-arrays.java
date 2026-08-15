class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int tl=nums1.length+nums2.length;
        int nums3[] = new int[tl];
        
        for(int i = 0; i < nums1.length; i++){
            nums3[i]=nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            nums3[i + nums1.length] = nums2[i];
        }

        for(int i =0;i<nums3.length;i++){
            for(int j=i+1;j<nums3.length;j++){
                if(nums3[i]>nums3[j]){
                    int temp = nums3[i];
                    nums3[i]=nums3[j];
                    nums3[j]=temp;
                }
            }
        }

        int mid = nums3.length/2;

        if(nums3.length%2!=0){
            return nums3[mid];
        }
        else{
            double x = (nums3[mid]+nums3[mid-1])/2.0;
            return x;
        }
    }
}