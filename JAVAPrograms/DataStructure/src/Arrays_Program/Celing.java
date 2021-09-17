package Arrays_Program;
// smallest number grater then equal to Target
public class Celing {
    public static void main(String[] args) {
        System.out.println("Binary Search");
        int [] arr = {2,4,6,8,11,12,14,20,36,48};
        int target = 15;
        int ans = celing(arr,target);
        System.out.println(ans);
    }
    static int celing(int arr[],int target)
    {
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
        return start;
    }
}


