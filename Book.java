public class Book implements LibraryResource {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void borrow(String studentName) {
        System.out.println(studentName + " borrowed book: " + title);
    }
}