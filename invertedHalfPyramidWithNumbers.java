package patterns;

public class invertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        int totRows=5;
        for(int i=0;i<=totRows;i++){
            for(int j=1;j<=totRows-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
