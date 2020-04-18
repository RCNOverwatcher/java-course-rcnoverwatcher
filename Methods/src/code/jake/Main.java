package code.jake;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScoreposition(1500);
        displayHighScorePosition("Jake ", highScorePosition);

        highScorePosition = calculateHighScoreposition(900);
        displayHighScorePosition("Simon ", highScorePosition);

        highScorePosition = calculateHighScoreposition(400);
        displayHighScorePosition("Amelie ", highScorePosition);

        highScorePosition = calculateHighScoreposition(50);
        displayHighScorePosition("Jo ", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + "managed to get into position " + highScorePosition + " on the high score table.");

    }

    public static int calculateHighScoreposition(int playerScore) {
//        old code
//        if (playerScore >= 1000) {
//            return 1;
//        } else if(playerScore >= 500){
//            return 2;
//        } else if(playerScore >= 100) {
//        return 3;
//        }
//
//        return 4;
        int position = 4; //assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;

    }
    
}
