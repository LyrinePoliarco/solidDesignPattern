public class Journal implements LibraryResource {
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public void borrow(String studentName) {
        System.out.println(studentName + " borrowed journal: " + title);
    }
}
