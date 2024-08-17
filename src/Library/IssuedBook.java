package Library;

import java.time.LocalDate;

public class IssuedBook {
    String title;
    String author;
    String studentId;
    LocalDate issueDate;

    public IssuedBook(String studentId, LocalDate issueDate, String title , String author) {
        this.studentId = studentId;
        this.issueDate = issueDate;
        this.title = title;
        this.author = author;
    }
}