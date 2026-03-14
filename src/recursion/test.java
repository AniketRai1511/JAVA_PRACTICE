package recursion;

public class test {
    public static String uppercase(String str){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A'&&ch<='Z'){
                ch=(char)(ch+32);
            }
            if(ch!=' ') {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static boolean pal(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)==str.charAt(end)){
            return pal(str,start+1,end-1);
        }
        return false;

    }
    public static void main(String[] args) {
        String name="an         na       ";
        String ans=uppercase(name);
        System.out.println(ans);
        boolean a=pal(uppercase(name),0,uppercase(name).length()-1);
        System.out.println(a);

    }
}
