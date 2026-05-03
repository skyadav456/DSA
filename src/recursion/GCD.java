package recursion;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a= sc.nextInt();
        System.out.println("Enter the second number : ");
        int b=sc.nextInt();

        System.out.println("The gcd of number : "+gcd(a,b));
    }

    static int gcd(int a,int b){
        if (b==0) return a;
        return gcd(b,a%b);
    }


}
