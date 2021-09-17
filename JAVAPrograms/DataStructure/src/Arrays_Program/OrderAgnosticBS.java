package Arrays_Program;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        System.out.println("Order Agnostic Binary Search");
        int [] arr = {99,85,84,11,10,8,6,2,1};
        int target = 1;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int  orderAgnosticBS(int arr[],int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the Array is sorted in Ascending or Descending
        boolean isAsc = arr[start] < arr[end];
//        boolean isAsc;
//        if(arr[start] <arr[end])
//            isAsc = true;
//        else
//            isAsc = false;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (target < arr[mid]) {
                    start = mid + 1;

                } else {
                    end = mid - 1;
                }

            }

        }
        return -1;
    }
}
