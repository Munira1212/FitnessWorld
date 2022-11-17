import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
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
    // Attributer til min input, som bliver sat i MedlemOprettelse-------------------------------
    public String getInputName() {
        return inputName;
    }
    public int getInputAge() {
        return inputAge;
    }
    public String getInpuEmail() {
        return inpuEmail;
    }
    public int getInputTelefonNummer() {
        return inputTelefonNummer;
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
    public void oprettelsesInformation(){
        generateOprettelsesår();
         Scanner scanner= new Scanner(System.in);

        System.out.println("Name?");
        inputName =scanner.nextLine();

        System.out.println(" Alder");
        inputAge= sc.nextInt();

        System.out.println("Email?");
        inpuEmail = scanner.nextLine();

        System.out.println(" telefonnummer?");
        inputTelefonNummer= sc.nextInt();

        System.out.println("oprettelses dagen er: " + LocalDate.now());
    }


}
