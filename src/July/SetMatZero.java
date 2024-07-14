package July;
//DAY - 1
import java.util.*;

public class SetMatZero {
//DAY - 1
public static void main(String[] args) {
    int[][] mat = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
    };
    setZeroes(mat);
    for (int i = 0; i < mat.length; i++) {
        for (int j = 0; j < mat[0].length; j++) {
            System.out.print(mat[i][j]);
        }
        System.out.println();
    }
}

    static void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        Arrays.fill(row, false);
        Arrays.fill(col, false);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        //set the row to 0
        for (int i = 0; i < col.length; i++) {
            for (int j = 0; j < row.length; j++) {
                if (row[j]) matrix[j][i] = 0;
            }
        }

        //set the cols to 0 :
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                if (col[j]) matrix[i][j] = 0;
            }
        }


        //print the matrix :
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
