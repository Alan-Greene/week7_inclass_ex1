package week7_inclass_2;

public class Book {
    private String isbn;
    private String name;
    private String author;
    private String edition;

    public Book(String isbn, String name, String author, String edition){
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.edition = edition;
    }

    public String getName(){
        return this.name;
    }

    public void setEdition(String edition){
        this.edition = edition;
    }

    public String getEdition(){
        return this.edition;
    }

    public void print(){
        System.out.printf("Book isbn: %-10s%n", this.isbn);
        System.out.printf("Book name: %-10s%n", this.name);
        System.out.printf("Book author: %-10s%n", this.author);
        System.out.printf("Book edition: %-10s%n", this.edition);
    }
}
