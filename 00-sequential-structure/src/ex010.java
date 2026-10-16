// Read the start time and the end time of a game.
// Then calculate the duration of the game, knowing that it can start on one day and end on another,
// with a minimum duration of 1 hour and a maximum of 24 hours.

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int start_time = input.nextInt();
        int end_time = input.nextInt();

        if  (start_time == end_time){
            int duration = 24;
            System.out.printf("THE GAME LASTED %d HOUR(S)", duration);
        }

        else if (start_time > end_time) {
            int duration = (24 - start_time) + end_time;
            System.out.printf("THE GAME LASTED %d HOUR(S)", duration);
        }

        else {
            int duration = end_time - start_time;
            System.out.printf("THE GAME LASTED %d HOUR(S)", duration);
        }
    }
}
