package easy;

// https://leetcode.com/problems/matrix-diagonal-sum/submissions/

public class MatrixDiagonal {

    public int diagonalSum(int[][] mat) {

        int sum=0;
        for(int i=0,k=mat.length-1;i<mat.length;i++,k--)
        {
            sum=sum+mat[i][i];

            if(i!=k)
            {
                sum=sum+mat[i][k];
            }
        }
        return sum;
    }


    public static void main(String args[]){

        int [][] n  =  {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
       int s =  new MatrixDiagonal().diagonalSum(n);

       System.out.print(s);
    }
}
