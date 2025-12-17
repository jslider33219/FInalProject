public class Level1 extends HitchhikerFinal {

    System.out.println("Pennsylvania")

    system.out.println("the road is easy but yet its just started. old colonials blur in the right window as you turn your eyes to the new passanger.")

    System.out.println("Strike up a conversation with the new passanger? (yes/no)")
    while (true) {
        String input = scanner.nextLine().trim().toLowerCase();
        if (input.equals("yes")) {
            System.out.println("You decide to strike up a conversation. Basic thhings like their name and why yall are both heading the same way");
            System.out.println("My name is John, I'm actualy going west for a job. It hard to leave my life in New York behind but they say change is healthy.");
            userSanity -= 5;
            hitchSanity += 10;
            break;
        } else if (input.equals("no")) {
            System.out.println("You decide to keep to yourself, focusing on the road ahead.");
            System.out.println("The silence feels a little bit odd but it helps you foucs on the road");
            userSanity -=10;
            hitchSanity -= 10;
            break;
        } else {
            System.out.println("Invalid input. Please type 'yes' or 'no'.");
        }

        System.out.println("As the day rolls by you fine yourself at the end or the raod in Pennsylvania and entering ohio. A odd feeling creeps up in the back of your mind. You dont question it, almost feels important.");
    }
    
}
