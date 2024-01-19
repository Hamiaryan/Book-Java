class BookController {
    private Book model;
    private BookView view;

    public BookController(Book model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void setBookDetails(String title, String author, String isbn, String genre) {
        model.setTitle(title);
        model.setAuthor(author);
        model.setIsbn(isbn);
        model.setGenre(genre);
    }

    public void updateView() {
        view.printBookDetails(model);
    }
}