
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        for(int i=0; i<sb.length()/2; i++){
            int font = i;
            int end = sb.length()-i-1;

            char fontChar = sb.charAt(font);
            char endChar = sb.charAt(end);

            sb.setCharAt(font, endChar);
            sb.setCharAt(end,fontChar);
        }
        System.out.println(sb);
    }
}
