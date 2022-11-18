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

                case 1:

                    System.out.println(" Opret Medlem");

                    //mdo.OfficielListe();
                    mdo.oprettelsesInformation(lavedListee);
                   // mdo.createNewMember();
                    //System.out.println(mdo.getLavedListe());

                    break;
                case 2:
                    System.out.println("Diaktivere medlem");

                    break;
                case 3:
                    System.out.println("Opgrader til Primuam medlem");

                    break;
                case 4 :
                    System.out.println("Oversigt over medlemmer -sorteret");

                   mdo.printFriends(lavedListee);
                    break;

                case 5:
                    System.out.println("Tilføj en ven");

                    break;
                case 9:
                    System.out.println("9: Exit Program");
                    keepRunning = false;
                    break;
            }
           // keepRunning= false;
            printMenu();
            readChoice();

        }

    }
    
    


