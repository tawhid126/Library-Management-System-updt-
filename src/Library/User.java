package Library;

import java.util.Scanner;

public class User {
    private String userId;
    private String password;


    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;

    }
    public void setUserId(String userId){
        this.userId = userId ;
    }
    public String getUserId() {
        return userId;
    }

    public void setPassword(String password){
        this.password = password ;
    }
    public String getPassword() {
        return password;
    }


    public void issueBook(Library library, String title ,String author) {
        library.issueBook(title,author, userId);
    }

    public void returnBook(Library library) {
        library.returnBook(userId);
    }
}