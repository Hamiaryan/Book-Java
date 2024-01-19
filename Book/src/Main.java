
public class Main {

    public static void main(String[] args) {

        Book book = retrieveBookFromDatabase();


        BookView bookView = new BookView();


        BookController bookController = new BookController(book, bookView);

        bookController.setBookDetails("The Great Gatsby", "F. Scott Fitzgerald", "978-0-7432-7356-5", "Classic");

        System.out.print("\nBook Details after Updating:");

        bookController.updateView();
    }

    private static Book retrieveBookFromDatabase() {
        Book book = new Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4", "Classic");
        return book;
    }
}
