import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class Medlemmer implements Comparable<MedlemOprettelsesubclass> {
    private String name;
    private String email;
    private int telefonNummer;
    private int age;
    private String inputName;
    private String inpuEmail;
    private int inputTelefonNummer;
    private int inputAge;
    private boolean keepRunning;
   // private ArrayList<MedlemOprettelsesubclass> lavedListee = new ArrayList<>();
    private String info;


    Scanner sc = new Scanner(System.in);

    public Medlemmer(String name, int age, String email, int telefonNummer) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.telefonNummer = telefonNummer;
    }
    public Medlemmer() {
    }
    // Attributer som jeg getter i min medlemoprettelse og jeg "kinda" setter dem i vores konstrukter bliver sat i MedlemOprettelse...
    public String getName() {
        return name;
    }
    public int getage() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public int getTelefonNummer() {
        return telefonNummer;
    }
    public String getInfo() {
        return info;
    }

    //En metode der random vælger datoer-----------------
    public LocalDate generateOprettelsesår() {

            LocalDate ld = LocalDate.of(2002, Month.JANUARY, 1);
            long days = ChronoUnit.DAYS.between(ld, LocalDate.now());

            LocalDate dato= ld.plusDays(new Random().nextInt((int) days + 1));

          //System.out.println("you start your subscibtion " +  dato.getDayOfWeek());
           // System.out.println("the " + dato);
        return dato;

    }

    // informion der senere bliver i ------------------------------
    public void oprettelsesInformation( ArrayList<MedlemOprettelsesubclass>lavedListee){
      // generateOprettelsesår();
         Scanner scanner= new Scanner(System.in);

        System.out.println("Name?");
       String inputName =scanner.nextLine();

        System.out.println(" Alder");
        int inputAge= sc.nextInt();

        System.out.println("Email?");
       String inpuEmail = scanner.nextLine();

        System.out.println(" telefonnummer?");
        int inputTelefonNummer= sc.nextInt();

     MedlemOprettelsesubclass mdo = new MedlemOprettelsesubclass( inputName,inputAge,inpuEmail,inputTelefonNummer);
     lavedListee.add(mdo);
     System.out.println("oprettelses dagen er: " + LocalDate.now());
    }

    @Override
    public String toString() {
        return "Medlemmer{" +
                LocalDate.now() +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telefonNummer=" + telefonNummer +
                ", age=" + age +
                '}'+ "\n" ;
    }
}
