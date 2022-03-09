import java.util.*;

public class Matrix {
    static int row, col;
    static Scanner in = new Scanner(System.in);
    static float mat[][];
    static float mat3[][] = new float[3][3];
    static float transpose[][] = new float[3][3];
    public static void main(String[] args) {
        int choice = 0;
        System.out.println("Matrix operations: ");
        System.out.println("1. create Matrix using parameterized constructor, \n2. Display Matrix using constructor, \n3. create matrix of row and col, \n4. read matrix using method, \n5. transpose matrix, \n6. multiply two matrices, \n7. display content of argument matrix, \n8. display matrix, \n9. find maximum element of matrix, \n10. find average of matrix\n11. exit");
        
        while(choice!=11){
            System.out.println("enter your choice: ");
            choice = in.nextInt();
            
            switch(choice){
                case 1: 
                    Matrix mat1 = new Matrix(mat);
                break;
                case 2: 
                    Matrix mat2 = new Matrix();
                break;
                case 3: 
                    System.out.println("enter the row and col: ");
                    row = in.nextInt();
                    col = in.nextInt();
                    Matrix mat3 = new Matrix(row, col);
                break;
                case 4: 
                    readMatrix();
                break;
                case 5: 
                    float mat5[][];
                    mat5 = new float[3][3];
                    mat5 = transpose1();
                    for(int i = 0; i<3; i++){
                        for(int j = 0; j<3; j++){
                            System.out.print(mat5[i][j]+ " ");
                        }
                        System.out.println();
                    }
                break;
                case 6: 
                float mat12[][] = new float[3][3];
                System.out.println("enter the elements of an array: ");
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        mat12[i][j] = in.nextFloat();
                    }
                }
                float mat8[][] = matrixMultiplication(mat12);
                for(int i = 0; i<3; i++){
                    for(int j = 0; j<3; j++){
                        System.out.print(mat8[i][j]+ " ");
                    }
                    System.out.println();
                }
                break;
                case 7:
                    displayMatrix(mat);
                break;
                case 8:
                    displayMatrix1();
                break;
                case 9: 
                    float max1 = maximum_of_array();
                    System.out.println("maximum number in array mat: " +max1);
                break;
                case 10: 
                    float avg1 = average_of_array();
                    System.out.println("average of array mat: " +avg1);
                break;
            }
        }
    }
    Matrix(float a[][]){
        a = new float[][]{{12,34,45},{67,7,3}};
    }
    Matrix(){
        mat = new float[][]{{12,2,38},{34,56,3},{45,23,67}};
        System.out.println();
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
    Matrix(int row, int col){
        mat3 = new float[row][col];
        System.out.println("enter the elements of an array: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat3[i][j] = in.nextFloat();
            }
        }
    }
    static void readMatrix(){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static float[][] transpose1(){
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                transpose[i][j] = mat[j][i];  
            }    
        }
        return transpose;
    }
    static float[][] matrixMultiplication(float[][] second){
        float c[][]=new float[3][3];
        for(int i=0;i<3;i++){    
            for(int j=0;j<3;j++){    
                c[i][j]=0;      
                for(int k=0;k<3;k++)      
                {      
                    c[i][j]+=mat[i][k]*second[k][j];      
                }
            }
        }
        return c;
    }
    static void displayMatrix(float[][] a){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void displayMatrix1(){
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(mat3[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static float maximum_of_array(){
        float max = mat[0][0]; 
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(mat[i][j]>=max)
                    max = mat[i][j];
            }
        }
        return max;
    }
    static float average_of_array(){
        float avg = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                avg = avg + mat[i][j];
           }
        }
        avg = avg / 9;
        return avg;
    }

    
}
