package Arrays_Program;

public class SmallestLetter {
    public static void main(String[] args) {


    char [] leters = {'c','f','j'};
    char target = 'j';
    int ans = nextGreatestLetter(leters,target);
        System.out.println(ans);
}
    static char nextGreatestLetter(char[] letters, char target) {

            int start = 0;
            int end = letters.length-1;

            while (start <= end)
            {
                int mid = start+(end-start)/2;
                if(target < letters[mid])
                {
                    end = mid-1;
                }
                else if(target > letters[mid])
                {
                    start = mid+1;
                }

            }
            return letters[start % letters.length];
    }
}
