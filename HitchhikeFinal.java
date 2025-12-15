import java.util.Scanner;

public class HitchhikeFinal {

    public static void main(String[] args) {
        int hitchSanity = 75;
        int userSanity = 100;
        int distanceTraveled = 0;

        Scanner scanner = new Scanner(System.in);
        boolean replay = true;
        
        while (replay) {
            try {
                // Intro text
                System.out.println("Your name is Andrew. Age twenty-five. You just ended with your long-term girlfriend.");
                System.out.println("You found a job in your field with opportunity for growth and good salary.");
                System.out.println("You're setting out to relocate for the position.");
                System.out.println("Your life in New York is ending, and the trip to California starts now.\n");
                //damn ascii isn't working so we'll have to add later

                // Main loop
                while (hitchSanity > 0 && userSanity > 0 && distanceTraveled < 500) {
                     // Intro text
                System.out.println("Your name is Andrew. Age twenty-five. You just ended with your long-term girlfriend.");
                System.out.println("You found a job in your field with opportunity for growth and good salary.");
                System.out.println("You're setting out to relocate for the position.");
                System.out.println("Your life in New York is ending, and the trip to California starts now.\n");
                
                //damn ascii isn't working so we'll have to add later

                    System.out.println("A man stands at the roadside, thumb out, looking for a ride.");
                    System.out.println("Do you pick him up? (yes/no)");
                    //should be more ascii here

                    String response = scanner.nextLine().toLowerCase();

                    if (response.equals("yes")) {
                        System.out.println("\nYou pull over to allow him to enter.");
                        System.out.println("He gets in and thanks you profusely.");
                        System.out.println("\"Where are you headed stranger?\"");
                        String destination = scanner.nextLine();
                        System.out.println("\n\"Ah, " + destination + ", California? What are the odds? I've got business there myself.\"");
                        System.out.println("\"Looks like we'll be travel buddies, then!\"");
                        
                    } else {
                        System.out.println("\nYou drive past him. The drive to California is long and lonely.");
                        System.out.println("ENDING ONE: Indifference Spared the Cat.");
                        break;
                    }
                }

                // Replay prompt
                System.out.println("\nPlay again? (yes/no)");
                String replayResponse = scanner.nextLine().toLowerCase();
                replay = replayResponse.equals("yes");

            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                e.printStackTrace();
                replay = false;
            }
        }

        scanner.close();
    }
}
