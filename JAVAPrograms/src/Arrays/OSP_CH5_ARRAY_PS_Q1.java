package Arrays;

public class OSP_CH5_ARRAY_PS_Q1 {
    public static void main(String[] args) {
        System.out.println("Array Problem Set");
        //  Problem 1
        //  Create an array of 5 floats and calculate their Sums
//
        float[] marks = {12.2f, 34.5f, 56.6f, 78.8f, 8.9f};

        float sum = 0;
        for (float value : marks) {
            sum = sum + value;
        }
        System.out.println(sum);
    }
}
        // WAP to check whether the given integer is present in an array or not
       /* float[] marks = {12.2f, 34.5f, 56.6f, 78.8f, 8.9f};
        float num = 56.6f;
        boolean isInArray = false;
        for (float value : marks) {
            if (num == value) {
                isInArray = true;
                break;
            }
        }
            if (isInArray) {
                System.out.println("element is present in array");
            } else {
                System.out.println("element is not present in array");
            }*/

 /*   //problem 3

        // Calculate average marks from an array containing marks of
        // all student in physics using for each loop
        float [] marks = {89,98,76,89,88,78,78,89,87};
        float avg,sum = 0;
        for(float value:marks){
            System.out.println(marks.length);
            sum = value+sum;
            avg = sum/ marks.length;
            System.out.println("average marks in physics is "+ sum);
        }*/

        //Problem 4 To add 2 matrices of size 2 x 3
//        int[][] m1 =  { {1,2,3},
//                        {3,2,1}};
//
//        int[][] m2 =  { {1,2,3},
//                        {3,2,1}};
//
//        int[][] result =  { {0,0,0},
//                            {0,0,0}};
//
//        for(int i =0;i<m1.length;i++){
//            for(int j =0;j<m1[i].length;j++) {
//                System.out.print(result[i][j] + "");
//            }
//            result[i][j]= m1[i][j]+m2[i][j];
//            }
//        System.out.println(" ");
//        }

////Problem 5 Reverse an Array
//        int [] num = {10,28,56,67,87};
//        System.out.println(num.length);
////        for (int value :num) {
////            System.out.println(value);
////       for (int i =0 ; i< num.length;i++)
//     for (int i=num.length;-1>i;i--)
//       {
//           System.out.println(num[i]);
//        }
//
//    }
