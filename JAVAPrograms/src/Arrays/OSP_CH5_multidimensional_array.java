package Arrays;

public class OSP_CH5_multidimensional_array {
    public static void main(String[] args) {
        System.out.println("Multidimensional Array");

        int [][] flats = new int [2]  [3];
//                               row  col
        //                       0     1     2
//               row        0   101   102   103
//                          1   201   202   203




        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        System.out.println(flats.length);

        for(int i = 0; i<flats.length; i++)
        {
            for(int j = 0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            } System.out.println(" ");

        }



    }
}
