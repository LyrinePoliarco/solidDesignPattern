public class Capstone implements LibraryResource {
    private String title;

    public Capstone(String title) {
        this.title = title;
    }

    @Override
    public void borrow(String studentName) {
        System.out.println(studentName + " borrowed capstone: " + title);
    }
}
