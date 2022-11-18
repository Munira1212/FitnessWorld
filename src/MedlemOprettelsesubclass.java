import java.util.ArrayList;

public class MedlemOprettelsesubclass extends Medlemmer{

    public MedlemOprettelsesubclass(String name, int age, String email, int telefonNummer) {
        super(name, age, email, telefonNummer);
    }

    public MedlemOprettelsesubclass(){
        super();
    }
 private ArrayList<MedlemOprettelsesubclass> lavedListe;


    public void OfficielListe(ArrayList<MedlemOprettelsesubclass> lavedListe){
        ListeAfMedlemmerne.listeOprettelse(lavedListe);
    }

    // Jeg har hentede fra superklassen medlemmer------------------------------------------------------------------

    public void printFriends(ArrayList<MedlemOprettelsesubclass>lavedListee) {
     //   lavedListe.add(new MedlemOprettelsesubclass( getInputName(), getInputAge(), getInpuEmail(), getInputTelefonNummer()));

        System.out.println(lavedListee);
        //for (MedlemOprettelsesubclass f :lavedListee)
       // System.out.printf("%-12s%-30s%-30s%-30s%-10s%n",f.generateOprettelsesår(), f.getName(),f.getage(), f.getEmail(), f.getTelefonNummer(),
        //lavedListe.get(0).getInputName()
             //   f.getInputName(), f.getInputAge(), f.getInpuEmail(), f.getInputTelefonNummer());

    }

    public int compareTo(MedlemOprettelsesubclass o) {
        return 0;
    }

    public void createNewMember(){
        //lavedListe.add(new MedlemOprettelsesubclass( getInputName(), getInputAge(), getInpuEmail(), getInputTelefonNummer()));

    }


    public ArrayList<MedlemOprettelsesubclass> getLavedListe() {
        return lavedListe;
    }


   /* public String toString() {
        return super.toString() +  getInputName() + getInputAge() + getInpuEmail() + getInputTelefonNummer();
    }*/
}
