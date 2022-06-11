import java.util.Scanner;

public class Main {

    public static void divideBy5(int n) {
        for (int i=1; i<=n; i++) {
            if (i%5==0) System.out.print(i +", ");
            else {
                System.out.println("Not divisible by 5!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number");
        int n= scan.nextInt();
        divideBy5(n);

    }
}