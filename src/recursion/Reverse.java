package recursion;

public class Reverse {
    public static void main(String[] args) {
        int n=2365;
        int revNumber= rev(n,0);
        System.out.println(revNumber);
    }
    static int  rev(int n, int rev){
        if(n==0) return rev;
        int i = (rev * 10) + n %10;
        return rev(n/10,i);
    }
}
