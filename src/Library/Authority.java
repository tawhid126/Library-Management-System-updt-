package Library;

import java.util.Scanner;

public class Authority {
    private String username;
    private String password;
    private Scanner sc;
    private static String hi   ;
    private static String hello ;

    public Authority() {
        this.username = hi;
        this.password = hello;
        sc = new Scanner(System.in);
    }

    private void changeAuthorName(String authorName, String authorPass) {
       int t = 4;
       do{
           if (this.username.equalsIgnoreCase(authorName) && this.password.equalsIgnoreCase(authorPass)) {
               this.username = sc.next();
               t = 0;
           }else {
               t--;
               System.out.println("Invalid Author name or password. Try again left("+t+") attempt ");
           }
       }while (t>0);

    }

    private void changeAuthorPass(String authorName, String authorPass) {
        int t = 3;
        do{
            if (this.username.equalsIgnoreCase(authorName) && this.password.equalsIgnoreCase(authorPass)) {
                System.out.print("type new passwoed : ");
                String newPass = sc.next();
                System.out.print("Conform new passwoed : ");
                String comformPass = sc.next();
                if (newPass.equalsIgnoreCase(comformPass)){
                    this.password = sc.next();
                    t = 0;
                }else {
                    System.out.println("NewPass and Conform pass dosen't mach");

                }
            }else {

                System.out.println("Invalid Author name or password. Try again left("+t+") attempt ");
            }
        }while (t-->0);
    }
    public void name(){
        username = "amdin";
    }
    public void namee(){
        password = "admin123";
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}