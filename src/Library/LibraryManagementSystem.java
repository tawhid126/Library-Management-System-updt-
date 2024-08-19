package Library;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        UserManager userManager = new UserManager();
        Scanner sc = new Scanner(System.in);
        Authority authority = new Authority();

        /*
            Some pre-registered user &#xD83E;&#xDEE1;
        */

        userManager.registerUser("raj_dip", "mati_raj");
        userManager.registerUser("khalid", "rujina_Khaled");
        userManager.registerUser("parvez", "naireet_parvez");
        userManager.registerUser("hi", "1234");


        /*
            Pre-populate the library with some books &#xD83E;&#xDD71;
        */

        library.addBook("To Kill a Mockingbird", "Harper Lee");
        library.addBook("1984", "George Orwell");
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        library.addBook("Pride and Prejudice", "Jane Austen");
        library.addBook("The Lord of the Rings", "J.R.R. Tolkien");
        library.addBook("The Catcher in the Rye", "J.D. Salinger");
        library.addBook("Moby Dick", "Herman Melville");
        library.addBook("The Odyssey", "Homer");
        library.addBook("Great Expectations", "Charles Dickens");
        library.addBook("The Grapes of Wrath", "John Steinbeck");
        library.addBook("The Scarlet Letter", "Nathaniel Hawthorne");
        library.addBook("The Picture of Dorian Gray", "Oscar Wilde");
        library.addBook("The Brothers Karamazov", "Fyodor Dostoevsky");
        library.addBook("War and Peace", "Leo Tolstoy");
        library.addBook("Anna Karenina", "Leo Tolstoy");
        library.addBook("Hamlet", "William Shakespeare");
        library.addBook("Macbeth", "William Shakespeare");
        library.addBook("Romeo and Juliet", "William Shakespeare");
        library.addBook("The Iliad", "Homer");
        library.addBook("The Divine Comedy", "Dante Alighieri");
        library.addBook("One Hundred Years of Solitude", "Gabriel García Márquez");
        library.addBook("Love in the Time of Cholera", "Gabriel García Márquez");
        library.addBook("The Kite Runner", "Khaled Hosseini");
        library.addBook("The Alchemist", "Paulo Coelho");
        library.addBook("The Little Prince", "Antoine de Saint-Exupéry");
        library.addBook("The Hobbit", "J.R.R. Tolkien");
        library.addBook("The Hunger Games", "Suzanne Collins");
        library.addBook("Divergent", "Veronica Roth");
        library.addBook("The Fault in Our Stars", "John Green");
        library.addBook("The Book Thief", "Markus Zusak");
        library.addBook("The Giver", "Lois Lowry");
        library.addBook("The Maze Runner", "James Dashner");
        library.addBook("The Perks of Being a Wallflower", "Stephen Chbosky");
        library.addBook("The Notebook", "Nicholas Sparks");
        library.addBook("The Shack", "William P. Young");
        library.addBook("The Help", "Kathryn Stockett");
        library.addBook("The Girl on the Train", "Paula Hawkins");
        library.addBook("The Da Vinci Code", "Dan Brown");
        library.addBook("The Martian", "Andy Weir");
        library.addBook("The Goldfinch", "Donna Tartt");
        library.addBook("The Nightingale", "Kristin Hannah");
        library.addBook("The Hate U Give", "Angie Thomas");
        library.addBook("The Testaments", "Margaret Atwood");
        library.addBook("The Silent Patient", "Alex Michaelides");
        library.addBook("The Dutch House", "Ann Patchett");
        library.addBook("The Vanishing Half", "Brit Bennett");
        library.addBook("The Midnight Library", "Matt Haig");
        library.addBook("To Kill a Mockingbird", "Harper Lee");
        library.addBook("1984", "George Orwell");
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("Harry Potter and the Philosopher's Stone", "J.K. Rowling");
        library.addBook("Pride and Prejudice", "Jane Austen");
        library.addBook("The Lord of the Rings", "J.R.R. Tolkien");
        library.addBook("The Catcher in the Rye", "J.D. Salinger");
        library.addBook("Moby Dick", "Herman Melville");
        library.addBook("The Odyssey", "Homer");
        library.addBook("Great Expectations", "Charles Dickens");
        library.addBook("The Grapes of Wrath", "John Steinbeck");
        library.addBook("The Scarlet Letter", "Nathaniel Hawthorne");
        library.addBook("The Picture of Dorian Gray", "Oscar Wilde");
        library.addBook("The Brothers Karamazov", "Fyodor Dostoevsky");
        library.addBook("War and Peace", "Leo Tolstoy");
        library.addBook("Anna Karenina", "Leo Tolstoy");
        library.addBook("Hamlet", "William Shakespeare");
        library.addBook("Macbeth", "William Shakespeare");
        library.addBook("Romeo and Juliet", "William Shakespeare");
        library.addBook("The Iliad", "Homer");
        library.addBook("The Divine Comedy", "Dante Alighieri");
        library.addBook("One Hundred Years of Solitude", "Gabriel García Márquez");
        library.addBook("Love in the Time of Cholera", "Gabriel García Márquez");
        library.addBook("The Kite Runner", "Khaled Hosseini");
        library.addBook("The Alchemist", "Paulo Coelho");
        library.addBook("The Little Prince", "Antoine de Saint-Exupéry");
        library.addBook("The Hobbit", "J.R.R. Tolkien");
        library.addBook("The Hunger Games", "Suzanne Collins");
        library.addBook("Divergent", "Veronica Roth");
        library.addBook("The Fault in Our Stars", "John Green");
        library.addBook("The Book Thief", "Markus Zusak");
        library.addBook("The Giver", "Lois Lowry");
        library.addBook("The Maze Runner", "James Dashner");
        library.addBook("The Perks of Being a Wallflower", "Stephen Chbosky");
        library.addBook("The Notebook", "Nicholas Sparks");
        library.addBook("The Shack", "William P. Young");
        library.addBook("The Help", "Kathryn Stockett");
        library.addBook("The Girl on the Train", "Paula Hawkins");
        library.addBook("The Da Vinci Code", "Dan Brown");
        library.addBook("The Martian", "Andy Weir");
        library.addBook("The Goldfinch", "Donna Tartt");
        library.addBook("The Nightingale", "Kristin Hannah");
        library.addBook("The Hate U Give", "Angie Thomas");
        library.addBook("The Testaments", "Margaret Atwood");
        library.addBook("The Silent Patient", "Alex Michaelides");
        library.addBook("The Dutch House", "Ann Patchett");
        library.addBook("The Vanishing Half", "Brit Bennett");
        library.addBook("The Midnight Library", "Matt Haig");


        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Register User");
            System.out.println("2. Login User");
            System.out.println("   **User Menu");
            System.out.println("    *Issue Book");
            System.out.println("    *Return Book");
            System.out.println("    *View Issued Books");
            System.out.println("    *Search Book");
            System.out.println("    *Display Books");


            System.out.println("3. Add Book (Admin Only)");
            System.out.println("4. Remove Book (Admin Only)");
            System.out.println("5. Show All User(Admin Only)");

            System.out.println("6. Show All Issued Books By All User");
            System.out.println("7. Search Book");
            System.out.println("8. Display Books");
            System.out.println("9. Issue Book");
            System.out.println("10. Return Book");
            System.out.println("11. View Issued Books");
            System.out.println("12. Change your Name( Authority / user) or Password");
            System.out.println("13. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    String userId = sc.next();

                    userManager.RegisterUser(userId);

                    System.out.println("User registered successfully!");
                break;

                case 2:
                    System.out.print("Enter User ID: ");
                    userId = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();
                    User user = userManager.loginUser(userId, password);
                    if (user != null) {
                        while (true) {
                            System.out.println("\nUser Menu");
                            System.out.println("1. Issue Book");
                            System.out.println("2. Return Book");
                            System.out.println("3. View Issued Books");
                            System.out.println("4. Search Book");
                            System.out.println("5. Display Books");
                            System.out.println("6. Logout");
                            System.out.print("Choose an option: ");
                            int userChoice = sc.nextInt();
                            sc.nextLine();

                            switch (userChoice) {
                                case 1:
                                    System.out.print("Enter Book Title: ");
                                    String titleToIssue = sc.nextLine();
                                    System.out.print("Enter author name: ");
                                    String authorIssue =sc.nextLine();
                                    user.issueBook(library , titleToIssue , authorIssue);
                                break;

                                case 2:
                                    user.returnBook(library);
                                break;

                                case 3:
                                    library.viewIssuedBooks(user.getUserId());
                                break;

                                case 4:
                                    System.out.print("Enter Book Title: ");
                                    String titleToSearch = sc.nextLine();
                                    System.out.print("Enter Book Author: ");
                                    String authorToSearch = sc.nextLine();
                                    library.searchBook(titleToSearch, authorToSearch);
                                break;

                                case 5:
                                    library.displayBooks();
                                break;

                                case 6:
                                    System.out.println("Logging out...");
                                    break;

                                default:
                                    System.out.println("Invalid choice. Please try again.");
                            }

                            if (userChoice == 6) break;
                        }
                    }
                    break;

                case 3: // Admin functionality
                    for (int i = 2; i > 0; i--) {
                        System.out.print("Enter Admin Username: ");
                        String adminUsername = sc.nextLine();
                        System.out.print("Enter Admin Password: ");
                        String adminPassword = sc.nextLine();
                        if (authority.authenticate(adminUsername, adminPassword)) {
                            System.out.print("Enter Book Title: ");
                            String titleToAdd = sc.nextLine();
                            System.out.print("Enter Book Author: ");
                            String authorToAdd = sc.nextLine();
                            library.addBook(titleToAdd, authorToAdd);
                            System.out.println("The book: " + titleToAdd + " by " + authorToAdd + " has been added.");
                            i=0;
                        } else if(i==1){
                            System.out.println("Invalid admin credentials. You can try again ("+i+" times)");
                        }else {
                            System.out.println("Invalid admin credentials.");
                        }
                    }
                    break;

                case 4: // Admin functionality
                    for (int i = 2; i > 0; i--) {
                        System.out.print("Enter Admin Username: ");
                        String adminUsername = sc.nextLine();
                        System.out.print("Enter Admin Password: ");
                        String adminPassword = sc.nextLine();
                        if (authority.authenticate(adminUsername, adminPassword)) {
                            System.out.print("Enter Book Title: ");
                            String titleToRemove = sc.nextLine();
                            System.out.print("Enter Book Author: ");
                            String authorToRemove = sc.nextLine();
                            library.removeBook(titleToRemove, authorToRemove);
                            System.out.println("The book: " + titleToRemove + " by " + authorToRemove + " has been removed.");
                            i=0;
                        }else if(i==1){
                            System.out.println("Invalid admin credentials. You can try again ("+i+" times)");
                        }else {
                            System.out.println("Invalid admin credentials.");
                        }
                    }

                    break;

                case 5:
                    for (int i = 2; i > 0; i--) {
                        System.out.print("Enter Admin Username: ");
                        String adminUsername = sc.nextLine();
                        System.out.print("Enter Admin Password: ");
                        String adminPassword = sc.nextLine();
                        if (authority.authenticate(adminUsername, adminPassword)) {
                            userManager.getUser();
                            i=0;
                        } else if(i==1){
                            System.out.println("Invalid admin credentials. You can try again ("+i+" times)");
                        }else {
                            System.out.println("Invalid admin credentials.");
                        }
                    }
                    break;
                case 6:
                    library.ShowAllIssuedBook();
                    break;

                case 7:
                    System.out.print("Enter Book Title: ");
                    String titleToSearch = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String authorToSearch = sc.nextLine();
                    library.searchBook(titleToSearch, authorToSearch);
                    break;

                case 8:
                    library.displayBooks();
                    break;
                case 9:
                    System.out.println("Please log in for issue books \uD83E\uDEF6.");
                    break;
                case 10:
                    System.out.println("Please log in for issue and return books \uD83E\uDEF6.");
                    break;
                case 11:
                    System.out.println("Please log in your userId for view issued books \uD83E\uDEF6.");
                    break;
                case 12:
                    System.out.println("1. Change your userName");
                    System.out.println("2. Change your userPass");
                    System.out.println("3. Change Admin name");
                    System.out.println("4. Change Admin pass");
                    System.out.println("5. Back to menu");

                    int press = sc.nextInt();
                    sc.nextInt();

                    switch (press) {
                        case 1:
                            System.out.println("For change your userName you have to log in : ");
                            System.out.print("Enter User ID: ");
                            String userid = sc.next();
                            System.out.print("\nEnter Password: ");
                            String pass = sc.next();
                            userManager.changeUserId(userid, pass);
                            break;
                        case 2:
                            System.out.println("For change your userPass you have to log in : ");
                            System.out.print("Enter User ID: ");
                            String useriid = sc.next();
                            System.out.print("\nEnter Password: ");
                            String passs = sc.next();
                            userManager.changeUserPass(useriid, passs);
                            break;
                        case 3:
                            System.out.println("For change your userName you have to log in : ");
                            System.out.print("Enter Admin name: ");
                            String adminNAme = sc.next();
                            System.out.print("\nEnter Password: ");
                            String adminPass = sc.next();
                            userManager.changeUserId(adminNAme, adminPass);
                            break;
                        case 4:
                            System.out.println("For change your userPass you have to log in : ");
                            System.out.print("Enter User ID: ");
                            String AdminName = sc.next();
                            System.out.print("\nEnter Password: ");
                            String AdminPass = sc.next();
                            userManager.changeUserPass(AdminName, AdminPass);
                            break;
                        case 5:
                            System.out.println("Backing to menu.....");
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");

                    }

                    break;
                case 13:
                    System.out.println("Exiting the system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
