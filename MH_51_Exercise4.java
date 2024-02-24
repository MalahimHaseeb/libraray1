import java.util.Scanner;
class Library {
    int max = 10;
    boolean exit = false ;
    private String[] books = {};
    public Library() {
        books = new String[max];
        System.out.println("Which function you want to implement in our library?");
        System.out.print(" add --> AddBook\n available --> Available Books\n return --> ReturnBook\n issue --> BorrowBook \n 0 --> exit \n ");
        while (!exit) {
            Scanner sc = new Scanner(System.in);
            String user = sc.next().toLowerCase();
            if (user.equals("add")) {
                System.out.println("Add the book which you want to add");
                String book = sc.next();
                setBooks(book);
            } else if (user.equals("available")) {
                getBooks();
            } else if (user.equals("0")) {
                 exit = true ;
            } else if (user.equals("issue")) {
                System.out.println("Which book which you want to borrow");
                getBooks();
                String book = sc.next();
                setIssue(book);
            } else if (user.equals("return")) {
                System.out.println("Which book which you want to return");
                String book = sc.next();
                returnBooks(book);
            }else {
                System.out.println("Wrong function");
            }
        }
    }
    public void getBooks() {
        System.out.println("Available Books:");
        for (String book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
    public void setBooks(String book) {
        for (int i = 0; i < max; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println( book +" Added successfully");
                return;
            }
        }
    }
    public void returnBooks(String book) {
        for (int i = 0; i < max; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book returned successfully");
                return;
            }
        }
    }
    public void setIssue(String book) {
        for (int i = 0; i < max; i++) {
            if (books[i] != null && books[i].equalsIgnoreCase(book)) {
                books[i] = null;
                System.out.println("Book '" + book + "' issued successfully");
                return;
            }
        }
        System.out.println("Book '" + book + "' not found in the library");
    }
}
public class MH_51_Exercise4 {
    public static void main(String[] args) {
        Library lb = new Library();
    }
}