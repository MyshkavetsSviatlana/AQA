package aqajava.hw7;

import java.util.Arrays;

/*
Create a square two-dimensional integer array (the number of rows and columns are the same),
and use loops to fill its diagonal elements with ones (you can fill only one diagonal
if both are difficult). The diagonal elements can be identified as follows:
the indices of these elements are equal, i.e., [0][0], [1][1], [2][2], ..., [n][n].
 */

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[5][5];

        for(int i = 0; i < twoDimArray.length; i ++){
            for(int j = 0; j < twoDimArray[i].length; j ++) {
                if(i == j || (i + j) == 4) {
                    twoDimArray[i][j] = 1;
                }
            }System.out.println(Arrays.toString(twoDimArray[i]));
        }
        //System.out.println(Arrays.deepToString(twoDimArray));
    }
}
