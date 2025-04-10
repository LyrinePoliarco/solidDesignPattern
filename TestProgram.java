public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Lyrine");

        LibraryResource book = new Book("Clean Code");
        LibraryResource journal = new Journal("Nature Journal");
        LibraryResource newspaper = new Newspaper("NEU Times");
        LibraryResource thesis = new Thesis("AI Research");
        LibraryResource capstone = new Capstone("Library Management System");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(newspaper);
        student.borrowResource(thesis);
        student.borrowResource(capstone);
    }
}
