package Assignment;

public class Q37MatrixSum {

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{4, 5, 6}, {2, 7, 8}, {3,1,9}};

        Q37MatrixSum ob = new Q37MatrixSum();
        ob.sumMatrix(matrix1,matrix2);

    }

    void sumMatrix(int[][] m1, int[][] m2){
            int[][] m3=new int[m1.length][m2.length];
                for (int i=0; i<3; i++){
                    for(int j=0; j<3;j++){
               m3[i][j]=m1[i][j]+m2[i][j];
                        System.out.print(m3[i][j]+"\t");
                }
                    System.out.println();
                }
}
}


/*for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        c[i][j]=a[i][j]+b[i][j];    //use - for subtraction
        System.out.print(c[i][j]+" ");
        }
        System.out.println();//new line
        }
        }} */