package task4;

class Book {
    public String title;
    public String author;
    public boolean isIssued;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
}

class Member {
    public String name;
    public int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void issueBook(Book book) {
        book.isIssued = true;
        System.out.println(name + " issued " + book.title);
    }
}

public class LibrarySystem_Original_AIVersion {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert C. Martin");
        Member m1 = new Member("Hanif", 101);
        Member m2 = new Member("Ali", 102);

        m1.issueBook(b1);
        m2.issueBook(b1); // BUG: same book gets "issued" twice - no check
        System.out.println("Book issued status: " + b1.isIssued);
    }
}
