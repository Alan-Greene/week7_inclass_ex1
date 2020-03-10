package week7_inclass_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] first_book = TestBook.promptUser();
        Book book1 = new Book(first_book[0], first_book[1], first_book[2], first_book[3]);
        book1.print();
        System.out.println("");
        String[] second_book = TestBook.promptUser();
        Book book2 = new Book(second_book[0], second_book[1], second_book[2], second_book[3]);
        book2.print();
        System.out.println("");
        String new_edition = TestBook.promptForEdition();
        System.out.println(" ");
        book1.setEdition(new_edition);
        System.out.println("");
        book1.print();
        book2.print();
    }
}
