import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println();
        System.out.println("Cześć, witam w programie word_coder. Pamiętaj, że");
        System.out.println("nie można używać polskich znaków, dużych liter ani cyfer!");

        byte c = 0;


        while (c != 1) {

            System.out.println();

            System.out.println("Jeżeli chcesz zakodować text wybierz 1");
            System.out.println("Jeżeli chcesz odkodować text wybierz 2");


        try{
        byte x = scanner.nextByte();

        scanner.nextLine();

        if(x == 1){
            Encoder coder = new Encoder();
            System.out.println("\nWpisz tekst do zakodowania: ");
            String text = scanner.nextLine();
            System.out.println("Zakodowany tekst: " + coder.codeIt(text));
            try{

                System.out.print("\nJeżeli chcesz kontynuować wpisz dowolną liczbę. Żeby wyjść wpisz 1: ");
                c = scanner.nextByte();
                scanner.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Błąd!");
                System.exit(0);
            }


        }else if(x == 2){
            Encoder_reverse reverse = new Encoder_reverse();
            System.out.println("\nWklej tekst do odkodowania: ");
            String text = scanner.nextLine();
            System.out.println("Odkodowany tekst: " + reverse.encodeIt(text));

            try{

                System.out.print("\nJeżeli chcesz kontynuować wpisz dowolną liczbę. Żeby wyjść wpisz 1: ");
                c = scanner.nextByte();
                scanner.nextLine();
            }catch (InputMismatchException e){
                System.out.println("Błąd!");
                System.exit(0);
            }
        }else{
            System.out.println("\nBłąd! Wpisz 1 lub 2.");
        }}catch (InputMismatchException e){
            System.out.println("\nBłąd!");
            System.exit(0);
        }}










    }





}
