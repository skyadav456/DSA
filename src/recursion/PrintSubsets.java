package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintSubsets {
    public static void main(String[] args) {
        String s= "abc";
        List<String> list= new ArrayList<>();
        subsets("",s,0,list);
        Collections.sort(list);    // for lexicographically order
        System.out.println(list);

        /* here we take array list to add subset inside the list
        *  otherwise we can print it normally */
    }

    public static void subsets(String ans,String s, int idx ,List<String> list) {
        if(idx==s.length()){
            //System.out.print(ans+" ");
            if(ans.length()!=0){
                list.add(ans);
            }
            return;
        }
        char ch= s.charAt(idx);
         subsets(ans+ch,s,idx+1,list); // include or pick
         subsets(ans,s,idx+1,list);    // exclude or skip

    }


}
