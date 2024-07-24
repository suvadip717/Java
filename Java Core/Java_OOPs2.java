
class computer {

    public void playMusic() {
        System.err.println("Play Music....");
    }

    public String getMePen(int cost) {
        if (cost >= 10) {
            return "Pen";
        }
        return "Nothing";
    }
}

public class Java_OOPs2 {

    public static void main(String args[]) {
        computer com = new computer();
        com.playMusic();
        String myPen = com.getMePen(5);
        System.out.println(myPen);
    }
}
