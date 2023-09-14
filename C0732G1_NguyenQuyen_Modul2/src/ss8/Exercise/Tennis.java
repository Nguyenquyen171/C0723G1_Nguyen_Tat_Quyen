package ss8.Exercise;

public class Tennis {
   public static final String SCORE = "Love";
    public static  final String SCORE1 = "Fifteen";
    public static final String SCORE2 = "Thirty";
    public static final String SCORE3 = "Forty";
    public static String drawDisplay(int playerScore){
        String resultDisplay;
        switch (playerScore) {
            case 0:
                resultDisplay = "Love-All";
                break;
            case 1:
                resultDisplay = "Fifteen-All";
                break;
            case 2:
                resultDisplay = "Thirty-All";
                break;
            case 3:
                resultDisplay = "Forty-All";
                break;
            default:
                resultDisplay = "Deuce";
                break;
        }
        return resultDisplay;
    }
    public static String winDisplay(int player1Score, int player2Score){


        int minusResult = player1Score - player2Score;

        if (minusResult == 1) return "Advantage player1";
        if (minusResult == -1) return "Advantage player2";
        if (minusResult >= 2) return "Win for player1";
        return "Win for player2";
    }
    public static String matchDisplay(int playerScore){
        String result = "";
        switch(playerScore) {
            case 0:
                result = SCORE ;
                break;
            case 1:
                result = SCORE1;
                break;
            case 2:
                result = SCORE2;
                break;
            case 3:
                result = SCORE3;
        }
        return result;
    }
}