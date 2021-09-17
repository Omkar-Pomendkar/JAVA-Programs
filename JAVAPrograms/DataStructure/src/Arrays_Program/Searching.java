package Arrays_Program;

public class Searching {
    public static void main(String[] args) {
        System.out.println("searching");
        int [] arr = {12,43,56,76,89,43,56};
        int target = 56;
        int ans = search(arr,target);
        System.out.println(ans);
    }

     static int search(int[] arr, int target) {
            if(arr.length == 0)
            {
                return -1;
            }
         for (int i = 0; i < arr.length; i++) {
             int element = arr[i];
             if(target == element)
             {
                 return i;
             }

         }
         return -1;
    }

}
