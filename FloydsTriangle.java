package patterns;

public class FloydsTriangle {
    public static void main(String[] args) {
        int totRows=5;
        int count=1;
        for(int i=0;i<totRows;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
