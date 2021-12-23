//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.

//ANSWER : 
class Solution {
    public void setZeroes(int[][] matrix) {
        
        boolean setZero = false;
        for(int i=0; i<matrix.length; i++)
        {
            if(matrix[i][0] == 0)
                setZero = true;
            for(int j=1; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int i=matrix.length-1; i>=0; i--)
        {
            for(int j=matrix[0].length-1; j>0; j--)
            {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if(setZero)
                matrix[i][0] = 0;
        }
        
    }
}
