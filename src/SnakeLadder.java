

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome");
        int startPosition = 0;
        int currentPosition = 0;
        int IS_SNAKE=2;
        int IS_LADDER=1;


                int diceNumber= (int) (Math.floor(Math.random() * 10) % 6+1);
            System.out.println(diceNumber);

            int option = (int) (Math.floor(Math.random() * 10) % 3);
            System.out.println(option);
            if( option == IS_SNAKE)
            {
                currentPosition = currentPosition - diceNumber;
                System.out.println("snake" +currentPosition);
            }
            else if( option == IS_LADDER )
            {
                currentPosition = currentPosition + diceNumber;
                System.out.println("ladder" +currentPosition);
            }
            else
            {
                System.out.println("No play option");
            }
    }
}