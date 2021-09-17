package STRING;

public class linear_search {
    public static void main(String[] args) {
        System.out.println("Linear Search");
        int [] arr = {10,20,30,40,50,11,2,9,78,96};
        int target = 96;
        int ans = search(arr,target);
        System.out.println(ans);

    }

    static int search(int [] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (target == element) {
                return i;
            }

        }
        return -1;
    }
}
