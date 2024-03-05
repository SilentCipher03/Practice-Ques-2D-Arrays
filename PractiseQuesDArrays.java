import java.util.*;

public class PractiseQuesDArrays {

    //Print the number of 7’s that are inthe 2d array
    public static int NumofAppearance(int matrix[][], int key){
        int sum =0;

        for(int i = 0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    sum++;
                }
            }
        }
        return sum;
    }

    //Print out the sum of the numbers inthe second row of the “nums” array
    public static int sumSecondRow(int matrix[][]){

        int sum =0;
        for(int j= 0; j<matrix[0].length; j++){
            sum += matrix[1][j];
        }
        return sum;
    }
    
    //Write a program to FindTransposeofa Matrix
    public static void  printTranspose(int matrix[][]){
        
        for(int i=0; i<matrix[0].length; i++){
            for(int j =0; j<matrix.length; j++){
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]){
        //Ques1
        int matrix[][] = {{4,7,8},
                          {8,8,7}};
        System.out.println(NumofAppearance(matrix,7));

        //Ques2
        int matrix2 [][] = {{1,4,9},
                            {11,4,3},
                            {2,2,3}};
        System.out.println(sumSecondRow(matrix2));

        //Ques3
        int matrix3[][] = {{2,3,4},
                           {5,6,7}};
        printTranspose(matrix3);
    }
}
