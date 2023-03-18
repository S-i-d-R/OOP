package Seminar_6.models;

public class UserReporter implements Reporter<User>{
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}