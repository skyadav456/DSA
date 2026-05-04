package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int input= sc.nextInt();
        generateParenthesis(input);
    }

    private static void generateParenthesis(int input) {
        List<String> list= new ArrayList<>();
        helper("" ,0,0, input,list);
        System.out.println(list);
    }

    private static void helper(String curr, int open, int close, int n, List<String> result) {
        // base case - two base case we can use
       /* if(curr.length()==2*n){
            result.add(curr);
            return;
        }*/
        if(open==n && close==n){
            result.add(curr);
            return;
        }
        if(open<n){
            helper(curr+"(",open+1,close,n,result);
        }
        if(close<open){
            helper(curr+")",open,close+1,n,result);
        }
    }
}
