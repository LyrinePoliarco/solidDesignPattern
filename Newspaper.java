public class Newspaper implements LibraryResource {
    private String title;

    public Newspaper(String title) {
        this.title = title;
    }

    @Override
    public void borrow(String studentName) {
        System.out.println(studentName + " borrowed newspaper: " + title);
    }
}
