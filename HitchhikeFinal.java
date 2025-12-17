import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HitchhikeFinal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean replay = true;

        while (replay) {

            // initialize/reset per playthrough
            int hitchSanity = 75;
            int userSanity = 100;
            int distanceTraveled = 0;
            int userThirst = 90;
            int userHunger = 80;
            int dayCount = 1;
            int hitchFriendship = 0;

            try {

                HashMap<String, Integer> inventory = new HashMap<>(10);

                // Inventory system setup
                inventory.put("Water Bottle", 2);
                inventory.put("Snacks", 3);
                inventory.put("Sandwiches", 1);
                inventory.put("Map", 1);
                inventory.put("First Aid Kit", 1);  
                inventory.put("Baseball Bat", 0);

                // Main loop
                while (hitchSanity > 0 && userSanity > 0 && distanceTraveled < 2800) {
                    // Intro text
                    System.out.println("\nYour name is Andrew. Age twenty-five. You just ended with your long-term girlfriend.");
                    System.out.println("You found a job in your field with opportunity for growth and good salary.");
                    System.out.println("You're setting out to relocate for the position.");
                    System.out.println("Your life in New York is ending, and the trip to California starts now.\n");
                    System.out.println("              ......-------+++++++###########-+####++#####+++++++----#####################################+++++--------...   \r\n"
                            + "              ......-------++++++++############ .###########++++++++-+##########################---+####-####++++++---.......\r\n"
                            + "              .......------+++++++############################++++++++++++####################+.---++##+.....+###++++++---...\r\n"
                            + "             .........-------+++++#+##################################+##++++#++++++++++++++++-++++  ..........+--+##++++++--\r\n"
                            + "        .   ............-------++++####################################################+##++++++##+.     .....###...######+++\r\n"
                            + "          -.  .-------------+++++###############################################################+. ..-###.    ......#########\r\n"
                            + "          ..+#-.-+++###############++#++++++++----++- -########################################....    ..#####     .#########\r\n"
                            + "     .....---+##.                    .###########++---++#####################################......     ..+###.     -########\r\n"
                            + "  ...----+++++---.        . ..           -########################################+######-..........    ..     .#############\r\n"
                            + "  ..---++++######++-.                      ..-----+++##################################.............    +####################\r\n"
                            + "                                          --++#########++#######+####################................   -####################\r\n"
                            + "                                        +###########################################............-#####   ####################\r\n"
                            + "           .--+#+                       ################################+-##########+-........+########-.####################\r\n"
                            + "        .#######.                     ..+###############################  +#######.#######+.#################################\r\n"
                            + "        ##-#####                       ..#################.  .#    #####   ###     .#####      .   +##-######################\r\n"
                            + "        ########-                    ..-.#################   ###    ###  - ####     #####     ##-  +#########################\r\n"
                            + "        .########                     .  .###############+  #####-  ##+ -#+ ###- #  .###  +   ##+  ##########################\r\n"
                            + "         #########                   ..-.  ##############.  +#      ##  ### ###. #   ##  ##   ##-  ##########################\r\n"
                            + "         -########+                 .-++   +#############   -###    -.  .++  ##. ##   - ###   ##   ##########################\r\n"
                            + "         .#########-                ..-++.+###############   ##.       ##### ##  ##+    ##+   ##   ##########################\r\n"
                            + "          ##########-             ....-++-##################.-#. -+#-.######+.    ##   ##      .--+##-.+#####################\r\n"
                            + "#####- .-#######++###+            .--..++###############-..######### ############  ######-++.################+###############\r\n"
                            + "#######   +############-           ...---+###########+  ###  ####### ###########+   #######.# ++############# ###############\r\n"
                            + "########      .. +#####-      ...  .  .-#############  ######-###### .+. -######    #########       .########  -  .##########\r\n"
                            + "########        -###+          -+---+################  ###########.  -#########-  #  ########  ##+    #####   .##############\r\n"
                            + "########    -#######-         ..-#####################   -##########.-#########  ### ########  ####   #######..#####-.#######\r\n"
                            + "+###+##-     #######-              - .+##################-.  .######-.########+  ###  ######  +#-     #######- #####-   #####\r\n"
                            + "-..          +#####                   .  #################### +#####- ########  ####-   -###   ++     ##    -  #####+     +##\r\n"
                            + "       -+#######-      .....     .......     ######## -###### -#####+ #######+         ####  ##     ###.####-  #####-      ..\r\n"
                            + "          .####.       ...................   #....###   ####  ######+ #######  ######      .####.  #####.#.#-  ####+.        \r\n"
                            + " .#+######. .+-           .............-++.  -#..... .      -#######+ #################- #########   ######    +###-         \r\n"
                            + "   +########-              ................#  ###...    ...-########- #############################.            ##+.         \r\n"
                            + "     #######.           ...........+##+-+-... .-+-..       ....  -###################################.         ..        ..  \r\n"
                            + "       #####             ......... ..-######+. .-+..          ..-############################################+-.             \r\n"
                            + "         +##            .......... ....--#+##-  ....         ..-+#++######################################+-.                \r\n"
                            + "       .   .             ........-.....+-+#+#+. ....           ..--++###############################+-..                    -\r\n"
                            + "                             ................#-. ...            ...---++++++#+#############++##+...                       -+#\r\n"
                            + "         .                      ....................          ...........-...+#####+++++### .--    ####+.         -      +###\r\n"
                            + "          ..                     ......#......... ..                .....   #####+.....-+## .    +#####+ ##             -    \r\n"
                            + "+           .                      ......-........                         #####.      -###.    #####+-    ++          ..    \r\n"
                            + "++           ..              .     .......-.-.......                     .++++-   +######-.    ++.          ..         #####+\r\n"
                            + ".-#                            .. .  .......+#-...       ##############++##########################-  +##########-    .######\r\n"
                            + "  +--                            ...............-..####+-.--.++###################################################+- -+##++##\r\n"
                            + " .#####+--                              ..  . ...................############################################+##-.  -    -###\r\n"
                            + "... ...--.                              .     ..................+###################+-++################+--+---+-  .       ##");

                    System.out.println("A man stands at the roadside, thumb out, looking for a ride.");
                    System.out.println("Do you pick him up? (yes/no)");

                    String response = scanner.nextLine().trim().toLowerCase();

                    if (response.equals("yes")) {
                        System.out.println("\nYou pull over to allow him to enter.");
                        System.out.println("He gets in next to you, tosses his suitcase in the back and thanks you profusely.");
                        System.out.println("\"Where are you headed stranger?\"");
                        String destination = scanner.nextLine();
                        System.out.println("\n\"Ah, " + destination + ", California? What are the odds? I've got business there myself.\n");
                        System.out.println("\nLooks like we'll be travel buddies, then!\"");
                        System.out.println("With a stranger riding shotgun you cross into New Jersey.");
                        distanceTraveled += 20;

                        // level 1 start
                        System.out.println("\nJersey --> Pennsylvania");
                        System.out.println("Jersey passes with little in the way of conversation. \nYou have yet to get comfortable with the stranger. \nOld colonials blur in the right window as you turn your eyes to this new passenger.");
                        System.out.println("Strike up a conversation with the passenger? (yes/no)");

                        // First interaction
                        while (true) {
                            String input = scanner.nextLine().trim().toLowerCase();
                            if (input.equals("yes")) {
                                System.out.println("You decide to strike up a conversation. You share basic things, like your name and reason for traveling.");
                                System.out.println("\"My name is John,\" says the passenger. \"I'm actually going west for a job, too.\" \n\"It's hard to leave my life in New York behind, but they say change is healthy.\"");
                                userSanity -= 5;
                                userThirst -= 10;
                                hitchSanity += 10;
                                hitchFriendship += 8;
                                break;
                            } else if (input.equals("no")) {
                                System.out.println("You decide to keep to yourself, focusing on the road ahead.");
                                System.out.println("The silence feels slightly uneasy, but it helps you focus on the road.");
                                hitchSanity -= 10;
                                break;
                            } else {
                                System.out.println("Invalid input. Please type 'yes' or 'no'.");
                            }
                        }

                        distanceTraveled += 510;
                        System.out.println("A odd feeling creeps up in the back of your mind. You don't question it, almost feels important.");
                        userHunger -= 10;
                        System.out.println("\nDay " + dayCount + " Summary -\nHunger: " + userHunger + "/100, Thirst: " + userThirst + "/100, Distance Traveled: " + distanceTraveled + "/2,800 miles.");
                   
                        dayEndDisplay(inventory);
                        int[] stats = useItems(scanner, inventory, userThirst, userHunger, userSanity, distanceTraveled);
                        userThirst = stats[0];
                        userHunger = stats[1];
                        userSanity = stats[2];
                        distanceTraveled = stats[3];
                        dayCount += 1;
                        // LEVEL 1 END

                        System.out.println("\nPennsylvania --> Ohio");
                        System.out.println("\nPulling your weary body from the motel bed, you prepare for another day on the road.");
                        System.out.println("John is already leaned casually against the passenger door, stretching and looking around.");
                        System.out.println("He looks relaxed, but his clothes are the same as yesterday, only sleep-rumpled.");
                        System.out.println("Do you ask him about it? (yes/no)");

                        // Second level
                        while (true) {
                            String input2 = scanner.nextLine().trim().toLowerCase();
                            if (input2.equals("yes")) {
                                System.out.println("\nYou ask John about his unchanging attire.");
                                System.out.println("His eye twitches, almost imperceptibly.");
                                System.out.println("\"Oh, this old thing?\" he chuckles. \"I don't have many clothes to choose from. Just the essentials for my trip west.\"");
                                System.out.println("He shrugs it off smoothly, but you notice a shine of something in his eyes.");
                                hitchSanity -= 25;
                                userSanity -= 10;
                                userThirst -= 10;
                                hitchFriendship -= 25;
                                if (hitchFriendship < 0) {
                                    hitchFriendship = 0;
                                }   
                                break;
                            } else if (input2.equals("no")) {
                                System.out.println("\nYou decide not to bring it up, focusing instead on the journey ahead.");
                                System.out.println("The silence between you feels a bit heavier, but you push the thought aside.");
                                hitchSanity += 15;
                                hitchFriendship += 5;
                                break;
                            } else {
                                System.out.println("Invalid input. Please type 'yes' or 'no'.");
                            }
                        }
                        userHunger -= 15;
                        System.out.println("The sun rises lazily into the sky as noon approaches.");
                        System.out.println("Your stomach growls sharply, reminding you that you skipped breakfast.");
                        System.out.println("Eat something? (yes/no)");
                        String eatResponse = scanner.nextLine().trim().toLowerCase();
                        if (eatResponse.equals("yes")) {
                            System.out.println("\nYou let John know you're feeling hungry, and propose taking a break to eat.");
                            if (hitchSanity < 50) {
                                System.out.println("He nods eagerly, \"Yeah, that sounds great. I've been meaning to grab a bite myself.\"");

                                if (inventory.get("Snacks") > 0) {
                                    System.out.println("\nYou pull out a snack from your bag and eat it.");
                                    inventory.put("Snacks", inventory.get("Snacks") - 1);
                                    userHunger += 20;
                                    if (userHunger > 100) {
                                        userHunger = 100;
                                    }
                                    System.out.println("You chat while eating, and feel a bit more energized after.");
                                    hitchFriendship += 10;
                                } else if (inventory.get("Sandwiches") > 0) {
                                    System.out.println("\nYou pull out a sandwich from your bag and eat it.");
                                    inventory.put("Sandwiches", inventory.get("Sandwiches") - 1);
                                    userHunger += 35;
                                    if (userHunger > 100) {
                                        userHunger = 100;
                                    }
                                    System.out.println("You chat while eating, and feel more energized after.");
                                    hitchFriendship += 13;
                                } else {
                                    System.out.println("\nYou check your bag but find no food left.");
                                    System.out.println("Your hunger remains unchanged.");
                                }

                            } else {
                                System.out.println("He glances at you, a vague smile crossing his face. \"Sure, a break sounds good.\"");
                                System.out.println("He recommends a small roadside diner, and the smell of frying food wafting through the air makes your empty stomach growl loudly as you pull in.");
                                System.out.println("A waitress appearing to be about your age approaches your booth.");
                                System.out.println("+++++################################++++++---------....--................ ...                ...----+++++---+++-----\r\n" + //
                                                                        "+++++++++++####################+++++.    .-----...-...... ........     .. ......----+++++++++++++++++++++++----------\r\n" + //
                                                                        "---++++----++++++##++++++++++++++.          ......             .----++++#++++++++++++++++++-----+++++++++++---------.\r\n" + //
                                                                        "....--------....--.......-......              .. ..---+++-++++++++++++++++++++++++--+---------..-...--....      .----\r\n" + //
                                                                        "                                       -+###. +++++++++++-++++++++++++++++++++-.                  -++++++++--++++++--\r\n" + //
                                                                        "                        ...---.      -++#####.+++++++----.----+++++++++++++++++-.   .             -++++++++++++++++  \r\n" + //
                                                                        "              ......----------.     +--+#####+---.          .-+++++++++++++++++-                  -+++++++++++++++.  \r\n" + //
                                                                        "    . ...............--------.  ...-++ -++##+-- ..          -++++++++++++++++++-                  -+++++++++-+++++   \r\n" + //
                                                                        "  ..+..........                   --+########++           +--++++++++++++++++++-     .            -+++++++++-+++#+   \r\n" + //
                                                                        "   ............           ..      -+++++-####++            .-++++++++++++++++++-                  -+++++++++-++++-   \r\n" + //
                                                                        "   .............          .        .++--++##+++            .-++++++++++++++++++-                 .+++++##+++-++++-   \r\n" + //
                                                                        "  ..............                 .- .-####+++++             -++++++++++++++++++-           .     -####-             .\r\n" + //
                                                                        ".  .............                ...#++++ -+++++             .-++++++  +++++++++-    .   ..-+  ---#####+   .......####\r\n" + //
                                                                        "   .............          .--    ..-##-  .. .++. ..         ..-++++.  .++++++++-    ... -.-+  +++#####-  ........  ##\r\n" + //
                                                                        "    ..........+-      .###+--      -#+ .     #-++#-         ..--++.    .#++++++-    ..- +-+#..########++.------... ##\r\n" + //
                                                                        " -  ..........+-      ####+--.   -.  .  .++   -+++#.        ..--+++++++++++++++-    +++-+.-#..########-#---------. -#\r\n" + //
                                                                        "     ...........     -++--- .    ..--  .+++.   #++##        ...-+++++++++++++++- #--##+          .###################\r\n" + //
                                                                        "      .........      .--..      .-+---.-+++++  -+++###########+++++++++++++++++- #-+##.            -#################\r\n" + //
                                                                        "       ........   .. ..-..           -++++#.--   --##..     .-+++++------++++++- #++#+-+#####-      -################\r\n" + //
                                                                        "    ............  -......            -. --. -- -+ .#+-.     .-+++++ .... -+++++- #+++++#######.    ..################\r\n" + //
                                                                        "    .      .....  --....            .. -+------   -+#++- +--+#+#+++ .... -+++++- #--..   ######++-...################\r\n" + //
                                                                        "   .-      .....  --.....          ..---.+-.-+    .-#+#+.-+ ##+#+++ .... .+++++- #+++#. .+########-.+################\r\n" + //
                                                                        "    ..     .---.  --....     .. .--..-. +-  +###     -.     -+#++++ -... .+++++. #+###++###########-#################\r\n" + //
                                                                        "   ...     ----.  --.    -+++++--.  ++-.   .#+##+++#++-     --+++++ .    -+++++. #.   ..##########+##################\r\n" + //
                                                                        "   ........-----  --. .. -++-++.   ++++---  -+ ----##+.     -++++++++++++++++++- #-  - ..----####+###################\r\n" + //
                                                                        "   ........-----  --  ..  -----.                  .##--     .-++++++++++####+++. #- .#+      ########################\r\n" + //
                                                                        "   .........----  ---.     +. .                #  -#  -     .-++++++++++######+. +          #########################\r\n" + //
                                                                        "  .........----- .+-+-####                     ####.  + .   .-+++++++++#######+. +--.    -+##########################\r\n" + //
                                                                        "  ..........----  .-+-####                     -###.  - .   .-++++++++########+. ..   - .++++###+++++################\r\n" + //
                                                                        "   ..-......----. .-+-###+                      ##++  . .   .-- +++++++########.     .#-  +#+##+++++++###############\r\n" + //
                                                                        "## .-#-...------...-+.###.                      ##+#  .     -.. - .++++######+#  .    .-++##-#++--+-+################\r\n" + //
                                                                        "##+++#######+  -#+.+-.###                        #+#    .   -   -   ++++######- ......+######+---+-+++###############\r\n" + //
                                                                        "++   -##-..    -#-.-- +##                        #+-        .       .---+++##- ...... +#####+-------.+############.  \r\n" + //
                                                                        "    +###--     +#- -- +##                         .-  - .-+-  -+######+###++#.  .+-+#-######-------+###########-+-+--\r\n" + //
                                                                        "   +####+      ##+.++.+#+                         +#  #              .........  .+-#++#####- .--- +##########+-++++-+\r\n" + //
                                                                        "   .+##.       +#-.++.+#                           -  +             ..... .-..  .... ####++  .. .+###########.--+---+\r\n" + //
                                                                        "   .+#.      .-+...+--+#                              -                . .-..   ....+#+##+  ...#---#########+-+######\r\n" + //
                                                                        "       ....#+-++..--.-+#                                                .-...    ...####+#+++++######################\r\n" + //
                                                                        "##   #.- .##+++#-.+#. +#                                   ...-+++++##++--######+++++++####++-+######################\r\n" + //
                                                                        "##   +#   ##-  +#  +-. -                                   .--..-  -+###+-+++#-++++++++-++++++++########+#+##########\r\n" + //
                                                                        "##   ##-  ##-   ##                                    .#+++++++++++##      -.    .-++--------++++######+ ++##########\r\n" + //
                                                                        "##  #  #.-#+#...-+  ..-.                        -.                             .+######################  #+##########\r\n" + //
                                                                        "+++++#+-       --++++++++++--....  -+-.            .                           +++++++++.    .-+++++++. .-.++++++++++\r\n" + //
                                                                        "                                                                                                                     \r\n" + //
                                                                        "      - - .-                                                                                                         \r\n" + //
                                                                        "                                                                                                                     \r\n" + //
                                                                        "                                                                                                                     ");
                                System.out.println("\"What can I get for you folks today?\" she asks with a polite grin.");
                                System.out.println("Her eyes flicker to John, lingering just a moment longer than necessary.");
                                System.out.println("Order something? (yes/no)");
                                String orderResponse = scanner.nextLine().trim().toLowerCase();
                                if (orderResponse.equals("yes")) {
                                    System.out.println("\nYou decide on a cheap, hearty meal with coffee.");
                                    System.out.println("John orders something similar, and the waitress flinches a little when he addresses her.");
                                    System.out.println("The food arrives quickly, and the warm, simple flavors help to soothe your hunger.");
                                    System.out.println("You almost don't notice, but the waitress that brings the food out is not the same one who took your order.");
                                    System.out.println("John eats with unusual focus, almost ravenously.");
                                    System.out.println("His is done well before your own, and you chat idly while you finish your meal.");
                                    userHunger += 40;
                                    if (userHunger > 100) {
                                        userHunger = 100;
                                    }
                                    userThirst += 40;
                                    if (userThirst > 100) {
                                        userThirst = 100;
                                    }
                                    hitchSanity += 15;
                                    hitchFriendship += 15;
                                    System.out.println("You feel much better after eating.");
                                } else {
                                    System.out.println("\nYou decide not to order anything, trying to save money and feeling too anxious to eat in front of a stranger.");
                                    System.out.println("John shrugs and says, \"No worries, we can grab something later.\"");
                                    System.out.println("You can feel his eyes on the back of your neck as you leave the diner.");
                                    hitchSanity -= 12;
                                    System.out.println("As Ohio fades into Indiana, your hunger remains unchanged.");
                                }
                            }
                        } else {
                            System.out.println("\nYou decide to tough it out and not eat right now.");
                        }
                        distanceTraveled += 270;

                        System.out.println("\nThe radio plays softly as the miles click by.");
                        System.out.println("Do what? (talk to John / take a drink/ eat something / keep driving)");
                        String actionResponse = scanner.nextLine().trim().toLowerCase();
                        switch (actionResponse) {
                            case "talk to john":
                                System.out.println("\nYou strike up a conversation with John.");
                                System.out.println("His blank eyes focus as his head swivels.");
                                System.out.println("\"Sorry, lost in thought.\" he says, then blinks rapidly.");
                            System.out.println("\"It's just...I'm heading to " + destination + " to see my daughter.\"");
                            System.out.println("\"I haven't seen her in years. When we lost her mother...neither of us took it well.\"");
                            System.out.println("Respond how? (sympathize / question him)");
                                String respondResponse = scanner.nextLine().trim().toLowerCase();
                                if (respondResponse.equals("sympathize")) {
                                    System.out.println("\nYou express sympathy for his situation.");
                                    System.out.println("John's eyes glisten slightly. \"Thanks. You're really a kind soul, you know that, Andy?\"");
                                    hitchFriendship += 35;
                                    hitchSanity += 20;
                                    userSanity += 10;

                                } else if (respondResponse.equals("question him")) {
                                    System.out.println("You point out that he had initially claimed to be heading west for a job, not to see a daughter.");
                                    System.out.println("John's face tightens, his eyes go dark in a way you haven't seen before.");
                                    System.out.println(
                                            "                                                                                          \r\n" +
                                            "                                                                                          \r\n" +
                                            "   .                                          ....++###-     +-#########################  \r\n" +
                                            "  ..                                           .+++###+#.      +########################  \r\n" +
                                            "  ####                              .-....     -+#######+     # ########################  \r\n" +
                                            "  --+++--.....--++##++#####- .  -#########################  \r\n" +
                                            "  --+++--.....--++##++#####- .  -#########################  \r\n" +
                                            "                             .-+++++---.....-+++++++#+######..+#########################  \r\n" +
                                            "  . -  ... -. .---....-..-++++#++++++-.... ----++++##+######-++#########################  \r\n" +
                                            "  +++-+++++++.+++++##############++++---..--.----+#+++######++##########################  \r\n" +
                                            "  ###++++++++++######################+++++---..---+-.-########+#########################  \r\n" +
                                            "  ######++++##########################++++++---..---.-##################################  \r\n" +
                                            "  ######################################++++-----.-.-+##################################  \r\n" +
                                            "  ####################################++++-.----.--.--+#################################  \r\n" +
                                            "  ####################################+++-..------..--+############################  ###  \r\n" +
                                            "  #################################+++++++-...---...--+############################   ##  \r\n" +
                                            "  #################################+++++++----....----+############################-  ##  \r\n" +
                                            "  ################################+++++++------.-..---+#############################  ##  \r\n" +
                                            "  ##############################++++++++-------------++#############################+.##  \r\n" +
                                            "  #############################++++++++++-+++---------++#############################.##  \r\n" +
                                            "  ########################+#++##++++++++++++++-------+++########################-+######  \r\n" +
                                            "  ########################+#++##++++++++++++++---.---+++######################## +.-####  \r\n" +
                                            "  ########################++#+###+++++++++++++---+----+###########################+ ####  \r\n" +
                                            "  ########################++#.+####+++++++-.     .-+- .+########################### ####  \r\n" +
                                            "  ######################++#++. #+###+++-               .################################  \r\n" +
                                            "  ########+++###########+.++++ ----                   -#################################  \r\n" +
                                            "  #####-. .   .+++++.  .   ---  .                    .-+######++########################  \r\n" +
                                            "  #####+..                 ---.                        .+++##+++########################  \r\n" +
                                            "  ########+--              -++-.                     .-+++###+++################-+######  \r\n" +
                                            "  ##########+.              +#++-                 ....---+#++++#########################  \r\n" +
                                            "  ########+.               -+##+-                 .......-++ .-+########################  \r\n" +
                                            "  ###########+.           .-+#++.            .     .---++++++++#########################  \r\n" +
                                            "  #############+-.      ---++++-.   .         .--..-++++#+++++##########################  \r\n" +
                                            "  #################++++##+++##++-. --. .-.   --++++#+#+-----+###########################  \r\n" +
                                            "  ##############+++++++++++++##+-....--++        -++++++-++++###########################  \r\n" +
                                            "  ##################++++#++##+---..   ##+            ..  ...+###########################  \r\n" +
                                            "  #####################+-+++##++--....+##.  -+            ...+##########################  \r\n" +
                                            "  ##################+-      ##++++-.  -######.               .-#########################  \r\n" +
                                            "  ################+-.     .+#######+- .+##+                    +########################  \r\n" +
                                            "  ##############+-.      +######++++. .-#.                      +################.######  \r\n" +
                                            "  #############+-.      -++######--.   -                         +############### ######  \r\n" +
                                            "  ############++-.     .+--+--+-##-                              -##############  +#####  \r\n" +
                                            "  ############+-.      -+##+##+.                                 .+############-   #####  \r\n" +
                                            "  ############+--.    .+#######+                                 .+###########+    #####  \r\n" +
                                            "  ############++-.    -++######+.                                .++##########     #####  \r\n" +
                                            "  ############++--   .--.+##+++-                                 .-+########+      #####  \r\n" +
                                            "  ############+++-....--.                                     .. .-+#######        #####  \r\n" +
                                            "  ############+++---..                                            .-######         #####  \r\n" +
                                            "  #############++++--                                            .-++####         ######  \r\n" +
                                            "  ###############+#+     .-+##.-.       .-..                      -+++#+          ####.#  \r\n" +
                                            "  ##############+++-     -+++#+--                                .---+-          #####..  \r\n" +
                                            "  ###############++-  .---+###+..                                -+++.          ########  \r\n" +
                                            "  ################++--++++-+#+#++--..--...-.                    .-++            ########  \r\n" +
                                            "  ##################++++++++++##+++++-------...                .-++            #########  \r\n" +
                                            "  #####################++++++++#+######+##+----.         -----..-+             #########  \r\n" +
                                            "  ############################+-+####+++++--.          .--++..-++             ##########  \r\n" +
                                            "  ####################-...+####++++++++--.             -++-. --.              ##########  \r\n" +
                                            "  #####################-.    -##+++++++----.           .                     ###########  \r\n" +
                                            "  #######################      -++++++-.---.                                 ###########  \r\n" +
                                            "  ########################       .+++++-.                                    ###########  \r\n" +
                                            "  ########################+          .-.                                     ###########  \r\n" +
                                            "  #########################-                                                 ###########  \r\n" +
                                            "  ##########################.                       .-                       ###########  \r\n" +
                                            "  ###########################-.-                 .-.                         ###########  \r\n" +
                                            "  ###########################+#                                             +##########  \r\n" +
                                            "  ###############################             .                               ##########  \r\n" +
                                            "  ################################                                             #########  \r\n" +
                                            "  ################################.                                            -########  \r\n" +
                                            "  #################################                                             ########  \r\n" +
                                            "  ##################################                                            .#######  \r\n" +
                                            "  ###################################                                            #######  \r\n" +
                                            "  ####################################.                                          #######  \r\n"
                                    );
                                    System.out.println("\"I'm sorry I was a bit guarded before. I thought we knew each other well enough now to be honest.\"");
                                    System.out.println("\" *Clearly* I was wrong.\"");
                                    hitchFriendship -= 20;
                                    hitchSanity -= 15;
                                    userSanity -= 10;
                                } else {
                                    System.out.println("\nInvalid response. You both fall silent, the tension thick in the air.");
                                    hitchSanity -= 10;
                                    hitchFriendship -= 10;
                                    userSanity -= 5;
                                }
                                break;

                            case "take a drink":
                                if (inventory.get("Water Bottle") > 0) {
                                    System.out.println("\nYou take a refreshing drink from your water bottle.");
                                    inventory.put("Water Bottle", inventory.get("Water Bottle") - 1);
                                    userThirst += 30;
                                    if (userThirst > 100) {
                                        userThirst = 100;
                                    }
                                    System.out.println("Your thirst is now " + userThirst + "/100.");
                                } else {
                                    System.out.println("\nYou check your bag but find no water left.");
                                }
                                break;
                            case "eat something":
                                if (inventory.get("Snacks") > 0) {
                                    System.out.println("\nYou eat some snacks from your bag.");
                                    inventory.put("Snacks", inventory.get("Snacks") - 1);
                                    userHunger += 20;
                                    if (userHunger > 100) {
                                        userHunger = 100;
                                    }
                                    System.out.println("Your hunger is now " + userHunger + "/100.");
                                } else {
                                    System.out.println("\nYou check your bag but find no food left.");
                                }
                                break;
                            case "keep driving":
                                System.out.println("\nYou decide to keep driving in silence, focusing on the road ahead.");
                                hitchSanity -= 5;
                                userSanity +=5;
                                break;
                            default:
                                System.out.println("\nInvalid action. You continue driving in silence.");
                                hitchSanity -= 5;
                                userSanity +=5;
                        }
                        distanceTraveled +=220;
                        System.out.println("\nYou pass into Springfield, Illinois as evening approaches.");
                        System.out.println("Stop for the night, or drive through it? (stop/drive)");
                        String nightResponse = scanner.nextLine().trim().toLowerCase();
                        if (nightResponse.equals("stop")) {
                            System.out.println("\nYou find a cheap motel and decide to stop for the night.");
                            System.out.println("John seems, as best you can tell, relieved to get out of the car for a while.");
                            System.out.println("Despite the cheap mattress you get a good night's rest, feeling more prepared for the journey ahead.");
                            hitchSanity += 20;
                            userSanity += 20;
                            boolean wichita = false;
                        } else {
                            System.out.println("\nYou decide to push through the night, determined to make as much progress as possible.");
                            System.out.println("The darkness and monotony of the road weigh heavily on you.");
                            System.out.println("The grating rhythm of John's ocassional mumbling only makes it worse.");
                            System.out.println("By the time his rambling turns to snores you notice your eye is twitching.");
                            hitchSanity -= 5;
                            userSanity -= 15;
                            distanceTraveled += 500;
                            boolean wichita = true;
                        }
                        System.out.println("\nDay " + dayCount + " Summary -\nHunger: " + userHunger + "/100, Thirst: " + userThirst + "/100, Distance Traveled: " + distanceTraveled + "/2,800 miles.");
                        
                        dayEndDisplay(inventory);
                        int[] stats2 = useItems(scanner, inventory, userThirst, userHunger, userSanity, distanceTraveled);
                        userThirst = stats2[0];
                        userHunger = stats2[1];
                        userSanity = stats2[2];
                        distanceTraveled = stats2[3];
                        dayCount += 1;

                        if (wichita) {
                            System.out.println("\nAs you approach Wichita, Kansas, the first light of dawn begins to break over the horizon.");
                        } else {
                            System.out.println("\nYou greet the day in Springfield, Illinois, feeling refreshed.");
                            System.out.println("The sun is shining brightly as you get back on the road towards Kansas.");
                        }
                        

                    } else {
                        System.out.println("\nYou drive past him. The drive to California is long and lonely.");
                        System.out.println("ENDING ONE: Indifference Spared the Cat.");
                        // player chose not to pick him up, end this playthrough
                        break;
                    }

                    if (hitchSanity > 0 && hitchFriendship >= 40) {
                        // His guilt overcomes him
                        System.out.println("\nJohn hesitates, then his face twists grotesquely.");
                        System.out.println("\"I can't do this anymore,\" he hisses.");
                        System.out.println("He begins to cry.");
                        System.out.println("He insists on parting ways, thanking you for the ride but saying he can't continue.");
                        System.out.println("You drop him off, feeling a mix of relief and guilt as he walks away.");
                        System.out.println("ENDING TWO: Mercy of the Spider.");
                        break;
                    }
                    if (hitchSanity <= 0 && hitchFriendship < 40) {
                        //he totally snaps
                        System.out.println("\nJohn's eyes glaze over, and he suddenly lunges at you.");
                        System.out.println("He's reached some unseen limit, and he can't be controlled anymore.");
                        if (inventory.getOrDefault("Baseball Bat", 0) > 0) {
                            //you defend yourself
                            System.out.println("You fumble around for the baseball bat you picked up earlier.");
                            System.out.println("His hands begin to close around your throat, and you wind your arm back as much as you can.");
                            System.out.println("Adrenaline pushing your strength to its limits, you swing the bat and connect solidly with his head.");
                            System.out.println("A wet thud echoes through your ears as John tumbles down, lax face hitting the dirt.");
                            System.out.println("You gasp for breath, heart pounding, unsure whether you've become a murderer.");
                            System.out.println("Have you saved yourself, or just delayed your fate?");
                            System.out.println("You drive away, hands pale with pressure against the steering wheel.");
                            System.out.println("ENDING THREE: Prey Instinct.");
                        } else {
                            //you fail to defend yourself
                            System.out.println("Unarmed, caught off guard, you are unable to defend yourself.");
                            System.out.println("He is bigger, stronger and more determined than you.");
                            System.out.println("His hands close around your throat. Your windpipe creaks under the pressure.");
                            System.out.println("John overpowers you, and the last thing you see is his dark, empty eyes.");
                            System.out.println("ENDING FOUR: The Dark Road.");
                        }
                    }

                    if (userSanity <= 0 && hitchFriendship < 20) {
                        //you totally snap
                        System.out.println("\nThe world blurs and twists before your eyes.");
                        System.out.println("Your mind fractures under the strain of uncertainty and fear.");
                        if (inventory.getOrDefault("Baseball Bat", 0) > 0) {
                            //you kill him
                            System.out.println("Panic overwhelming your senses, you grab frantically for the baseball bat.");
                            System.out.println("This man...this *monster*...he's been toying with you.");
                            System.out.println("You have to get away. You have to stop this. Now.");
                            System.out.println("With a hoarse scream, you swing the bat with all your might, connecting with his head.");
                            System.out.println("Manic giggles bubble out of you as he crumples.");
                            System.out.println("You make sure his seatbelt is fastened, adjust your rearview mirror, and drive on.");
                            System.out.println("Your passenger is, at last, blissfully silent.");
                            System.out.println("ENDING FIVE: Metamorphosis.");
                            break;
                        } else {
                            //you kill...you
                            System.out.println("Overcome with dread and paranoia, you lose control of yourself.");
                            System.out.println("The vehicle veers off the road, crashing violently. How long have you been driving like this?");
                            System.out.println("Everything goes black.");
                            System.out.println("ENDING SIX: The Final Stop.");
                        }
                    }

                    if (distanceTraveled >= 2800) {
                        //you made it!
                        System.out.println("Looks like your journey has come to an end.");
                        System.out.println("You've reached California! Congratulations! Get ready to start your new life.");
                        System.out.println("ENDING SEVEN: New Beginnings.");
                        break;
                    }
                } // end main gameplay loop

                // Replay prompt
                System.out.println("\nPlay again? (yes/no)");
                String replayResponse = scanner.nextLine().trim().toLowerCase();
                replay = replayResponse.equals("yes");

            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                e.printStackTrace();
                replay = false;
            }
        } // end while replay

        scanner.close();
    }

    private static void dayEndDisplay(HashMap<String, Integer> inventory) {
        System.out.print("Inventory: { ");
        for (String item : inventory.keySet()) {
            int qty = inventory.get(item);
            if (qty > 0) {
                System.out.print(item + ": " + qty + " .");
            }
        }
        System.out.println("}");
    }

    private static int[] useItems(Scanner scanner, HashMap<String, Integer> inventory, int userThirst, int userHunger, int userSanity, int distanceTraveled) {
        System.out.println("Use inventory item? (type item name or 'no')");
        String itemUse = scanner.nextLine().trim().toLowerCase();

        if (itemUse.equalsIgnoreCase("no")) {
            System.out.println("You chose not to use any items.");
            return new int[]{userThirst, userHunger, userSanity, distanceTraveled};
        }

        switch (itemUse) {
            case "water bottle":
                if (inventory.getOrDefault("Water Bottle", 0) > 0) {
                    userThirst += 30;
                    if (userThirst > 100) userThirst = 100;
                    inventory.put("Water Bottle", inventory.get("Water Bottle") - 1);
                    System.out.println("You drink a bottle of water. Thirst increased to " + userThirst + "/100.");
                } else {
                    System.out.println("\nYou check your bag but find no water left.");
                }
                break;
            case "snacks":
                if (inventory.getOrDefault("Snacks", 0) > 0) {
                    userHunger += 20;
                    if (userHunger > 100) userHunger = 100;
                    inventory.put("Snacks", inventory.get("Snacks") - 1);
                    System.out.println("You eat some snacks. Hunger increased to " + userHunger + "/100.");
                } else {
                    System.out.println("\nYou check your bag but find no snacks left.");
                }
                break;
            case "sandwiches":
                if (inventory.getOrDefault("Sandwiches", 0) > 0) {
                    userHunger += 35;
                    if (userHunger > 100) userHunger = 100;
                    inventory.put("Sandwiches", inventory.get("Sandwiches") - 1);
                    System.out.println("You eat a sandwich. Hunger increased to " + userHunger + "/100.");
                } else {
                    System.out.println("\nYou check your bag but find no sandwiches left.");
                }
                break;
            case "map":
                System.out.println("You check the map. It shows you're on the right path to California. About " + (2800 - distanceTraveled) + " miles to go.");
                break;
            case "first aid kit":
                if (inventory.getOrDefault("First Aid Kit", 0) > 0) {
                    userSanity += 20;
                    if (userSanity > 100) userSanity = 100;
                    inventory.put("First Aid Kit", inventory.get("First Aid Kit") - 1);
                    System.out.println("You check the first aid kit. Knowing it's there brings you comfort. Sanity increased to " + userSanity + "/100.");
                } else {
                    System.out.println("\nYou check your bag but find no first aid kit left.");
                }
                break;
            default:
                System.out.println("Invalid item or out of stock.");
                System.out.println("Try another item? (type item name or 'no')");
                String secondItemUse = scanner.nextLine().trim().toLowerCase();
                if (secondItemUse.equalsIgnoreCase("no")) {
                    System.out.println("You chose not to use any items.");
                } else {
                    // reuse the same logic by recursive-like handling (single extra attempt)
                    switch (secondItemUse) {
                        case "water bottle":
                            if (inventory.getOrDefault("Water Bottle", 0) > 0) {
                                userThirst += 30;
                                if (userThirst > 100) userThirst = 100;
                                inventory.put("Water Bottle", inventory.get("Water Bottle") - 1);
                                System.out.println("You drink a bottle of water. Thirst increased to " + userThirst + "/100.");
                            } else {
                                System.out.println("\nYou check your bag but find no water left.");
                            }
                            break;
                        case "snacks":
                            if (inventory.getOrDefault("Snacks", 0) > 0) {
                                userHunger += 20;
                                if (userHunger > 100) userHunger = 100;
                                inventory.put("Snacks", inventory.get("Snacks") - 1);
                                System.out.println("You eat some snacks. Hunger increased to " + userHunger + "/100.");
                            } else {
                                System.out.println("\nYou check your bag but find no snacks left.");
                            }
                            break;
                        case "sandwiches":
                            if (inventory.getOrDefault("Sandwiches", 0) > 0) {
                                userHunger += 35;
                                if (userHunger > 100) userHunger = 100;
                                inventory.put("Sandwiches", inventory.get("Sandwiches") - 1);
                                System.out.println("You eat a sandwich. Hunger increased to " + userHunger + "/100.");
                            } else {
                                System.out.println("\nYou check your bag but find no sandwiches left.");
                            }
                            break;
                        case "map":
                            System.out.println("You check the map. It shows you're on the right path to California. About " + (2800 - distanceTraveled) + " miles to go.");
                            break;
                        case "first aid kit":
                            if (inventory.getOrDefault("First Aid Kit", 0) > 0) {
                                userSanity += 20;
                                if (userSanity > 100) userSanity = 100;
                                inventory.put("First Aid Kit", inventory.get("First Aid Kit") - 1);
                                System.out.println("You check the first aid kit. Knowing it's there brings you comfort. Sanity increased to " + userSanity + "/100.");
                            } else {
                                System.out.println("\nYou check your bag but find no first aid kit left.");
                            }
                            break;
                        default:
                            System.out.println("Invalid item or out of stock. Try again tomorrow.");
                    }
                }
                break;
        }

        return new int[]{userThirst, userHunger, userSanity, distanceTraveled};
    }
}
