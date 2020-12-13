package http;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BookService bookService = new BookService();
        try {

            System.out.println("Wybierz opcję");
            System.out.println("1) Wprowadz numer ISBN");
            System.out.println("0) Zakoncz program");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            String result;

            switch (option) {
                case 1:
                    System.out.println("Wprowadz number ISBN");
                    String isbnNumber = scanner.next();
                    result = bookService.chooseBook(isbnNumber);
                    break;

                default:
                    result = "Nie rozpoznano wyboru";
            }

            System.out.println(result);

        } catch (CustomException e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}