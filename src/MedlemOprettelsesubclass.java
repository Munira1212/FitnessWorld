import java.util.ArrayList;

public class MedlemOprettelsesubclass extends Medlemmer{

    public MedlemOprettelsesubclass(String name, int age, String email, int telefonNummer) {
        super(name, age, email, telefonNummer);
    }

    public MedlemOprettelsesubclass(){
        super();
    }

    public void printFriends(ArrayList<MedlemOprettelsesubclass>lavedListee) {
        //System.out.println(lavedListee);
        for (MedlemOprettelsesubclass f :lavedListee)
       System.out.printf("%-12s%-30s%-30s%-30s%-10s%n",f.generateOprettelsesår(), f.getName(),f.getage(), f.getEmail(), f.getTelefonNummer());
    }

    public int compareTo(MedlemOprettelsesubclass o) {
        return 0;
    }

}
