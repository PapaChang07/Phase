import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args){
        Login();


        ArrayList<Driver> DriverList = new ArrayList<>();
        ArrayList<Profile> PassengerList = new ArrayList<>();
        ArrayList<Profile> ClassMates = new ArrayList<>();
        Profile B1 = new Profile("John", 408-1237698, "John1");
        Profile B2 = new Profile("Alex", 405-8436211, "Alex4");
        Profile B3 = new Profile("Smith", 475-8456432, "Smith3");
        Profile B4 = new Profile("Alec", 861-3409876, "RedBull");
        Profile B5 = new Profile("Robbie", 879-4564074, "MaineLover");
        ClassMates.add(B1);
        ClassMates.add(B2);
        ClassMates.add(B3);
        ClassMates.add(B4);
        ClassMates.add(B5);
        for (Profile p : ClassMates){
            Invitation(DriverList, PassengerList, p);
        }

        for (Driver d : DriverList) {
            while (d.getHotride().size() < d.getCapacity()) {
                if (PassengerList.size() != 0) {
                    d.getHotride().add(PassengerList.get(0));
                    PassengerList.remove(0);
                } else {
                    break;
                }
            }
        }

        for (Driver q : DriverList){
            System.out.println("Driver: " + q.toString() + "   Passengers with " + q.toString() + ": "  + q.getHotride().toString());
        }
        if (PassengerList.size() != 0){
            System.out.print("Classmates that don't have rides: ");
            for (Profile p : PassengerList){
                System.out.print(p.toString() + ", ");
            }
        }



    }

    public  static void Login(){
        Scanner in = new Scanner(System.in);
        System.out.println("Login or Create an New Account (login or create)");

        String login = in.nextLine().toLowerCase();
        if (login.equals("login")){
            try {
                Scanner s1 = new Scanner(System.in);
                System.out.println("Please input your Username");
                String Username = s1.nextLine().toLowerCase();
                System.out.println("Please input your Password");
                Scanner s2 = new Scanner(System.in);
                String Password = s2.nextLine().toLowerCase();
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Welcome to Phase");
                System.out.println("Prevent Hassle and Schedule Events");
            }
            catch (InterruptedException e){
                System.err.format("IOException: %s%n", e);
            }
        }
        else {
            try {
                Scanner s3 = new Scanner(System.in);
                System.out.println("Name: ");
                String Name = s3.nextLine().toLowerCase();
                System.out.println(" ");
                Scanner s4 = new Scanner(System.in);
                System.out.println("Phone Number: (No area code please!)");
                String PhoneNumber = s4.nextLine().toLowerCase();
                System.out.println(" ");
                Scanner s5 = new Scanner(System.in);
                System.out.println("Username: ");
                String Username = s5.nextLine().toLowerCase();
                System.out.println(" ");
                Scanner s6 = new Scanner(System.in);
                System.out.println("Password: ");
                String Password = s6.nextLine().toLowerCase();
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Welcome to Phase");
                System.out.println("Prevent Hassle and Schedule Events");
                System.out.println("");
                Profile Guest = new Profile(Name, Integer.parseInt(PhoneNumber), Username);
                System.out.println("This is your Profile!!");
                System.out.println(Guest.repr());
            }
            catch (InterruptedException e){
                System.err.format("IOException: %s%n", e);
            }
        }
    }
    public static void Invitation(ArrayList<Driver> DriverList, ArrayList<Profile> PassengerList, Profile RandomBoi){
            Scanner in = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Are you going to Friendsgiving? (Y or N)");

            String blah = in.nextLine().toLowerCase();
            if (blah.equals("y")) {
                System.out.println("Glad you can make it");
                Scanner driving = new Scanner(System.in);
                System.out.println("Can you give rides? (Y or N)");

                String answer = driving.nextLine().toLowerCase();
                if (answer.equals("y")) {
                    Scanner capacity = new Scanner(System.in);
                    System.out.println("How many can you drive?");

                    String cap = capacity.nextLine().toLowerCase();
                    Driver epicBoi = new Driver(RandomBoi.getName(), RandomBoi.getPhoneNumber(), RandomBoi.getUsername(), Integer.parseInt(cap));
                    DriverList.add(epicBoi);
                } else {
                    PassengerList.add(RandomBoi);
                }
            } else {
                System.out.println("Sorry that you can't make it!");
            }
        }


    }
