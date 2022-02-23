public class SnakeLadder {
private static final int startPosition = 0;
private static final  int IS_SNAKE=2;
private static final int IS_LADDER=1;
private static final int WINNIG_POSITION= 100;
private static  int diceCount = 0;
private static  String turn ="player1";

        public static void main(String[] args) {
//        System.out.println("Welcome");

            int currentPositionOfPlayer1 = startPosition;
            int currentPositionOfPlayer2 = startPosition;
            while (currentPositionOfPlayer1 < WINNIG_POSITION &&
                    currentPositionOfPlayer2 < WINNIG_POSITION) {
                diceCount++;
                if (turn.equals("player1")) {
                    turn = "player2";
                    currentPositionOfPlayer1 = getPosition(currentPositionOfPlayer1);
                } else {
                    turn = "player1";
                    currentPositionOfPlayer2 = getPosition(currentPositionOfPlayer2);
                }
            }
            System.out.println("currentPositionofplayer1 " + currentPositionOfPlayer1);
            System.out.println("currentPositionofplayer2 " + currentPositionOfPlayer2);
            System.out.println("no of times dice rolled  " +diceCount);
            if (currentPositionOfPlayer1 == WINNIG_POSITION) {
                System.out.println("Player 1 win the game");
            } else {
                System.out.println("Player 2 win the game");
            }
        }
        private static int getPosition(int currentPosition) {
            int diceNumber = (int) (Math.floor(Math.random() * 10) % 6 + 1);
            int option = (int) (Math.floor(Math.random() * 10) % 3);
            if (option == IS_SNAKE) {
                currentPosition = currentPosition - diceNumber;
                if (currentPosition < 0) {
                    currentPosition = 0;
                }
                //System.out.println("snake" + currentPosition);
            } else if (option == IS_LADDER) {
               if (currentPosition + diceNumber <= 100) {
                   currentPosition += diceNumber;
                }
                if (turn.equals("player2")) {
                    turn = "player2";
                } else if (turn.equals("player1")) {
                    turn = "player1";
                }
            }
            return currentPosition;
        }
}