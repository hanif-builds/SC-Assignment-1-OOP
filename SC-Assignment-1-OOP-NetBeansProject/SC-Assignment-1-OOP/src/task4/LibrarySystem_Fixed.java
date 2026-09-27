package task4;

// NOTE: Book/Member are renamed to BookFixed/MemberFixed here because
// LibrarySystem_Original_AIVersion.java (in this same package) already
// defines classes named Book and Member. Two classes can't share the
// same name within one package, so the corrected version gets distinct
// names to avoid a "duplicate class" compile error.

class BookFixed {
    private String title;
    private String author;
    private boolean isIssued;

    public BookFixed(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public boolean issue() {
        if (isIssued) {
            return false;
        }
        isIssued = true;
        return true;
    }

    public void returnBook() {
        isIssued = false;
    }
}

class MemberFixed {
    private String name;
    private int memberId;

    public MemberFixed(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void issueBook(BookFixed book) {
        boolean success = book.issue();
        if (success) {
            System.out.println(name + " successfully issued " + book.getTitle());
        } else {
            System.out.println(name + " could NOT issue " + book.getTitle() + " - already taken.");
        }
    }
}

public class LibrarySystem_Fixed {
    public static void main(String[] args) {
        BookFixed b1 = new BookFixed("Clean Code", "Robert C. Martin");
        MemberFixed m1 = new MemberFixed("Hanif", 101);
        MemberFixed m2 = new MemberFixed("Ali", 102);

        m1.issueBook(b1);
        m2.issueBook(b1); // Now correctly refused - book already issued
    }
}
