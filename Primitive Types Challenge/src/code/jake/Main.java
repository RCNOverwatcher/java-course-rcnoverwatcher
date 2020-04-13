package code.jake;

public class Main {

    public static void main(String[] args) {
        byte challengeByte = 10;
        short challengeShort = 20;
        int challengeInt = 50;
        long challengeLong = 50000L + (10L *(challengeByte + challengeInt + challengeShort));
        System.out.println(challengeLong);
    }
}
