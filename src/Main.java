import java.util.*;
public class Main {
    public static int possibleStringCount(String word){
        int count=1;
        for(int i=0;i<word.length()-1;i++){
            char ch=word.charAt(i);
            if(ch==word.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
    public static boolean string_match1(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        for(int i=0;i<n-m;i++){
            int j=0;
            int k=0;
            while(j<m && k<m && str1.charAt(j+i)==str2.charAt(j)){
                    k++;
                    j++;
            }
            if(k==m){
                return true;
            }
        }
        return false;
    }
    public static int [] lps_array(String s){
        int []lps=new int [s.length()];
        int i=1;
        int len=0;
        while(i< lps.length){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }

        return lps;
    }
    public static boolean string_match2(String t,String s){
        int i=0;
        int j=0;
        int []lps=lps_array(s);
        int m=s.length();
        while(i<t.length()){
            if(j==m){
                return true;
            }
            if(t.charAt(i)==s.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return false;
    }
    public static int max_depth(String s){
        int depth=0;
        int maxDepth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
                maxDepth=Math.max(maxDepth,depth);
            }
            else{
                if(s.charAt(i)==')'){
                    depth--;
                }
            }
        }
        return maxDepth;
    }
    public static void main(String[] args) {
    int ans=max_depth("(1+(2*3)+((8)/4))+1)");
        System.out.print(ans);
    }
}