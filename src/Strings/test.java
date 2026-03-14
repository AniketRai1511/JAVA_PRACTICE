package Strings;
import java.util.Arrays;
public class test {
    public static String Com_pre(String []str){
        StringBuilder result=new StringBuilder();
        Arrays.sort(str);
        int i=0;
        while(i<str[0].length() && i<str[str.length-1].length()){
            if(str[0].charAt(i)==str[str.length-1].charAt(i)){
                result.append(str[0].charAt(i));
            }
            else{
                if(i==0){
                    return "no";
                }
                else{
                    return result.toString();
                }
            }
            i++;
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String [] str={"dog","racecar","car"};
        String ans=Com_pre(str);
        System.out.print(ans);
    }
}
