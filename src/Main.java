import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner in;
    private static Random rand;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        rand = new Random();

        boolean isRunning = true;

        System.out.println("Welcome to Apex Legend Roulette! \n" +
                "________________________________");

        while (isRunning) {
            System.out.println("""
                    Please pick an option:\s
                    1. Random Legend\s
                    2. Random Weapon loadout\s
                    3. Random Legend and Weapon\s
                    4. X amount of random weapon loadouts\s
                    5. Exit""");
            int option = in.nextInt();

            switch (option) {
                case 1:
                    randomLegends();
                    break;
                case 2:
                    randomWeapons();
                    break;
                case 3:
                    randomLegends();
                    randomWeapons();
                    break;
                case 4:
                    System.out.println("How many random weapon loadouts would you like?");
                    int amount = in.nextInt();
                    for (int i = 0; i < amount; i++) {
                        System.out.println("Loadout " + (i + 1) + ": ");
                        randomWeapons();
                    }
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }

    private static void randomWeapons() {
        String[] weapons = {"Any", "Havoc Rifle", "Flatline", "Hemlock", "R-301", "Nemesis", "Alternator", "Prowler", "R-99", "Volt SMG", "C.A.R SMG", "Devotion LMG",
                "L-STAR EMG", "Spitfire", "Rampage LMG", "G7 Scout", "30-30 Repeater", "Bocek Bow", "Triple Take", "Longbow DMR", "Charge Rifle", "Sentinel", "Kraber .50-CAL",
                "Mastiff Shotgun", "EVA-8 Auto", "Mozambique Shotgun", "Peacekeeper", "RE-45 Auto", "P2020", "Wingman"};
        int random = rand.nextInt(weapons.length);
        int random2 = rand.nextInt(weapons.length);
        System.out.println("Your random weapons are: " + weapons[random] + " and " + weapons[random2] + "\n");

//        String[] weaponTypes = {"Assault Rifle", "Submachine Gun", "Light Machine Gun", "Sniper Rifle", "Shotgun", "Pistol"};
//        String[] AR = {"R-301", "Flatline", "Hemlock"};
//        String[] SMG = {"R-99", "Alternator", "Prowler"};
//        String[] LMG = {"Spitfire", "Devotion"};

    }

    private static void randomLegends() {
        String[] legends = {"Any", "Ash", "Bloodhound", "Gibraltar", "Lifeline", "Pathfinder", "Wraith",
                "Bangalore", "Caustic", "Mirage", "Octane", "Wattson", "Crypto", "Revenant",
                "Loba", "Rampart", "Horizon", "Fuse", "Valkyrie", "Seer", "Mad Maggie", "Ballistic",
                "Catalyst", "Newcastle", "Vantage"};
        int random = rand.nextInt(legends.length);
        System.out.println("Your random legend is: " + legends[random] + "\n");
    }
}