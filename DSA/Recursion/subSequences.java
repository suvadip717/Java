
public class subSequences {
    public static void subSequenc(String str, int idx, String newStr){
        if(str.length()==idx){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        subSequenc(str,idx+1,newStr+currChar);
        //not to be
        subSequenc(str,idx+1,newStr);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSequenc(str,0,"");
    }
}
