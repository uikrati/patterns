package patterns;

public class invertedHalfPyramid180degrees {
    public static void main(String[] args) {
        int totRows=4;
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=totRows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
