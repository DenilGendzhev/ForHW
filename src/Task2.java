import java.util.Scanner;

public class Task2 {

    public static void luckyNumbers(int a, int b, int c, int d) {
        if(a+b==c+d) {
            System.out.println(a + "" + b + "" + c + "" + d);
        }
        else{
            System.out.println("Not a lucky number");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A, B, C and D: ");
        int A= scan.nextInt();
        int B= scan.nextInt();
        int C= scan.nextInt();
        int D= scan.nextInt();
        luckyNumbers(A,B,C,D);
    }
}
