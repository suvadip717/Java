
public class String_buffer {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Navin ");
        sb.append("Readdy");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
    }
}
