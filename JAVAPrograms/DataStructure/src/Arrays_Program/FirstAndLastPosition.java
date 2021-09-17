package Arrays_Program;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        System.out.println("Finding First and Last Position");

    }
    public int searchRange(int[] nums, int target) {
    {
        int start = 0;
        int end = nums.length-1;

        while(start <= end)
        {   // find middle element
//            int mid = (start+end)/2; // exceed the range of interger in java
            int mid = start+(end-start)/2;

            if(target < nums[mid])
            {
                end = mid-1;
            }
            else if(target > nums[mid])
            {
                start = mid+1;
            }
            // if(target == mid)
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
}
