package Arrays_Program;
//greatest number smaller then equal to Target
public class Floor {
    public static void main(String[] args) {
        System.out.println("Binary Search");
        int [] arr = {2,4,6,8,11,12,14,20,36,48};
        int target = 15;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
    static int floor(int arr[],int target)
    {
        if(target > arr.length-1)
        {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start <= end)
        {   // find middle element
//            int mid = (start+end)/2; // excend the range of interger in java
            int mid = start+(end-start)/2;

            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if(target > arr[mid])
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

