package week7_inclass_2;

import java.util.Scanner;

public class TestBook {
    static Scanner in = new Scanner(System.in);

    static String[] book_details = new String[4];

    public static String[] promptUser(){
        System.out.printf("%s", "Please enter the books isbn: ");
        book_details[0] = in.nextLine();
        System.out.printf("%s", "Please enter the books name: ");
        book_details[1] = in.nextLine();
        System.out.printf("%s", "Please enter the books author: ");
        book_details[2] = in.nextLine();
        System.out.printf("%s", "Please enter the books edition: ");
        book_details[3] = in.nextLine();

        return book_details;
    }

    public static String promptForEdition() {
        System.out.printf("%s", "Please re enter the first books edition: ");
        return in.nextLine();
    }
}
