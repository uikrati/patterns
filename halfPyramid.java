package patterns;

public class halfPyramid {
    public static void main(String[] args) {
        int totRows=4;
        for(int i=1;i<=totRows;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
