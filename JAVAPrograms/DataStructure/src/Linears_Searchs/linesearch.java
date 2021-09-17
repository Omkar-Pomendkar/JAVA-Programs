package Linears_Searchs;

public class linesearch {
    public static void main(String[] args) {
        System.out.println("Implementing Linear Search");
        int[] marks = {80, 90, 78, 87, 50, 65};
        int target = 78;
        int ans = linear_search(marks, target, 1, 3);
        System.out.println(ans);
    }

    static int linear_search(int[] marks, int target, int start, int end) {
        int size = marks.length;
        if (size == 0) {
            return -1;
        }
        for (int i = 0; i < marks.length; i++) {
            int element = marks[i];
            if (element == target) {
                return i;
            }
        }
            return -1;
        }
    }

