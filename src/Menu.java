import java.util.ArrayList;
import java.util.Scanner;
public class Menu {

        private String menuHeader;
        private String leadText;

        private String menuItems;
        private int input;
        private boolean keepRunning;
    private ArrayList<MedlemOprettelsesubclass> lavedListee = new ArrayList<>();

        public Menu(String menuHeader, String leadText, String menuItems) {
            this.menuHeader = menuHeader;
            this.leadText = leadText;
            this.menuItems = menuItems;
        }
        public void printMenu() {
            System.out.println(menuHeader);
            System.out.println(leadText);
            System.out.println(menuItems);
        }


    MedlemOprettelsesubclass mdo= new MedlemOprettelsesubclass();


        public void readChoice() {

            if(lavedListee.size() == 0 ){
                     ListeAfMedlemmerne.listeOprettelse(lavedListee)  ;
            }
            Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
            switch (input) {

                case 1 ->    mdo.oprettelsesInformation(lavedListee);
                //=      System.out.println(" Opret Medlem");
                //mdo.oprettelsesInformation(lavedListee);
                //mdo.OfficielListe();
                   // mdo.createNewMember();
                    //System.out.println(mdo.getLavedListe());


                case 2->
                    System.out.println("Diaktivere medlem");


                case 3->
                    System.out.println("Opgrader til Primuam medlem");


                case 4 ->
                    //System.out.println("Oversigt over medlemmer -sorteret");

                   mdo.printFriends(lavedListee);


                case 5->
                    System.out.println("Tilføj en ven");


               /* case 9:
                    System.out.println("9: Exit Program");
                    keepRunning = false;
                    break;   */
            }
            printMenu();
            readChoice();

        }

    }
    
    


