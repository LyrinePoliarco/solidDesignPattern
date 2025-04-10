public class Thesis implements LibraryResource {
    private String title;

    public Thesis(String title) {
        this.title = title;
    }

    @Override
    public void borrow(String studentName) {
        System.out.println(studentName + " borrowed thesis: " + title);
    }
}