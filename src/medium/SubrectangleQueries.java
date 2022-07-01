package medium;

//https://leetcode.com/problems/subrectangle-queries/
public class SubrectangleQueries {

    int[][] matrix ;
    public SubrectangleQueries(int[][] rectangle) {

        matrix = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {

        for(int i=row1;i<=row2;i++){
            for(int j=col1; j<= col2; j++){
                matrix[i][j] = newValue;
             }

        }



     }

    public int getValue(int row, int col) {

        return 0;
    }

    public static void main(String args[]){
        int [][] m = {{3,4,2},{4,4,5},{5,6,3}};

       SubrectangleQueries s =  new SubrectangleQueries(m);
       s.updateSubrectangle(0,0,2,2,10);
    }
}
