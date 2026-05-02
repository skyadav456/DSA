package recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base : ");
        int a= sc.nextInt();
        System.out.println("Enter the exponent : ");
        int b= sc.nextInt();

        int p= pow(a,b);
        System.out.println(a+" raised to the power "+b+" is : "+p);
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        return  a* pow(a,b-1);
    }
}
