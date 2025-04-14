package time_info_for_days;

import java.util.Scanner;

public class DaysMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;


        while (running) {

            printDays();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println(Days.MONDAY.name() + " = " + "Working Hours '"+Days.MONDAY.getWorkHours()+"'");
                    break;
                case 2:
                    System.out.println(Days.TUESDAY.name() + " = " + "Working Hours '"+Days.TUESDAY.getWorkHours()+"'");
                    break;
                case 3:
                    System.out.println(Days.WEDNESDAY.name() + " = " + "Working Hours '"+Days.WEDNESDAY.getWorkHours()+"'");
                    break;
                case 4:
                    System.out.println(Days.THURSDAY.name() + " = " + "Working Hours '"+Days.THURSDAY.getWorkHours()+"'");
                    break;
                case 5:
                    System.out.println(Days.FRIDAY.name() + " = " + "Working Hours '"+Days.FRIDAY.getWorkHours()+"'");
                    break;
                case 6:
                    System.out.println(Days.SATURDAY.name() + " = " + "Working Hours '"+Days.SATURDAY.getWorkHours()+"'");
                    break;
                case 7:
                    System.out.println(Days.SUNDAY.name() + " = " + Days.SUNDAY.getWorkHours());
                    break;
                case 8:
                    running = false;

                default:
                    System.out.println("An incorrect entry was made!");


            }

        }

    }

    public  static void printDays(){
        System.out.println("Please enter numbers for daily working hours. ");
        System.out.println("1.MONDAY");
        System.out.println("2.TUESDAY");
        System.out.println("3.WEDNESDAY");
        System.out.println("4.THURSDAY");
        System.out.println("5.FRIDAY");
        System.out.println("6.SATURDAY");
        System.out.println("7.SUNDAY");
        System.out.println("8.Exit !");

    }
}
