package patterns;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        int totRows=4;
        int totCol=4;

        for(int i=0;i<totRows;i++ ){
            for(int j=totCol;j>0;j--){
                System.out.print("*");
            }
            totCol--;
            System.out.println();
        }
    }
}
