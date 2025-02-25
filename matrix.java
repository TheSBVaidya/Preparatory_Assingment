import java.util.Arrays;

public class matrix {
    public static void main(String[] args) {
        
        int[][] matrix1 = {{1,2,3} , {4,5,6} , {7,8,9}};
        int[][] matrix2 = {{1,2,3} , {4,5,6} , {7,8,9}};

        int[][] ans = new int[matrix1.length][matrix2.length];

        for(int i = 0; i<matrix1.length; i++) {
            for(int j = 0; j<matrix2.length; j++) {
                ans[i][j] = (matrix1[i][0] * matrix2[0][j]) + (matrix1[i][1] * matrix2[1][j])
                                + (matrix1[i][2] * matrix2[2][j]);
            }
        }

        System.out.println(Arrays.deepToString(ans));
        // for (int[] D1 : ans) {
        //     for(int D2 : D1) {
        //         System.out.print(D2 + " ");
        //     }
        //     System.out.println();
        // }

    }
}
