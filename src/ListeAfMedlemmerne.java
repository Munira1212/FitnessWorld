import java.util.ArrayList;

public abstract class ListeAfMedlemmerne {

    public static ArrayList<MedlemOprettelsesubclass> ListeOprettelse() {

        ArrayList<MedlemOprettelsesubclass> lavedListe = new ArrayList<>();

        lavedListe.add(new MedlemOprettelsesubclass("Bella", 18, "Bella@hotmail.com", 50508623 ));
        lavedListe.add(new MedlemOprettelsesubclass("Edward", 119, "Edwarda@hotmail.com", 50508623 ));
        lavedListe.add(new MedlemOprettelsesubclass("Jacob", 17, "JAcob@hotmail.com", 50508623 ));
        lavedListe.add(new MedlemOprettelsesubclass("Loco bella", 18, "Loco@hotmail.com", 50508623 ));
        lavedListe.add(new MedlemOprettelsesubclass("DR.collen", 171, "Munira@hotmail.com", 50508623 ));

        return lavedListe;
    }



}
