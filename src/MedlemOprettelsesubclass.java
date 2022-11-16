import java.util.ArrayList;

public class MedlemOprettelsesubclass extends Medlemmer{

    public MedlemOprettelsesubclass(String name, int age, String email, int telefonNummer) {
        super(name, age, email, telefonNummer);
    }

    public MedlemOprettelsesubclass(){
        super();

    }
 ArrayList<MedlemOprettelsesubclass> lavedListe;


    public void OfficielListe(){
        lavedListe = ListeAfMedlemmerne.ListeOprettelse();
    }

    // Jeg har hentede fra superklassen medlemmer
    public void printFriends() {
        lavedListe.add(new MedlemOprettelsesubclass( getInputName(), getInputAge(), getInpuEmail(), getInputTelefonNummer()));
        System.out.println();
        for (MedlemOprettelsesubclass f :lavedListe)
        System.out.printf("%-12s%-30s%-30s%-30s%-10s%n",f.generateOprettelsesår(), f.getName(),f.getage(), f.getEmail(), f.getTelefonNummer(),
                f.getInputName(), f.getInputAge(), f.getInpuEmail(), f.getInputTelefonNummer());

    }
    public int compareTo(MedlemOprettelsesubclass o) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
