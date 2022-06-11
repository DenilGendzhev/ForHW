import java.util.Scanner;

public class Task4 {

    public static void histogram(int n){

        for(int i=0;i<=n;i++){
            System.out.println(i);
            for(int j=0;j<=n;j++){
                System.out.println("* ");
            }
        }
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 100 and 30000: ");
        int n = scan.nextInt();
        histogram(n);
    }
}
