public class Main {

    //Henter fra Medlemoprettelse klasse
void run() {


    Menu menu = new Menu("Welcome to fitness world! ", "What can we do for you? : "," 1: To become a member 2: Deactive your membership, 3: Upgrade your mebership, " +
            "4: To View the other members ");
    menu.printMenu();
    menu.readChoice();

    //Metode ti at print vores instance fra listemedlemmer -klassen;

}

    public static void main(String[] args) {
        new Main().run();
    }

}

