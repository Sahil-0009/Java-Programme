
class computer {
    public void playMusic() {
        System.out.println("Music playing");
    }

    public String getMePen(int cost) {
        if (cost >= 10) {
            return "Pen";
        } else {
            return "No pen";
        }

    }
}

public class method24 {
    public static void main(String[] args) {
        computer com = new computer();
        com.playMusic();
        int cost = 1;
        String Result = com.getMePen(cost);
        System.out.println(Result);
    }
}
